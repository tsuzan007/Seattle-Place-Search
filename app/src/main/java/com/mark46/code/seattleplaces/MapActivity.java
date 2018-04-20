package com.mark46.code.seattleplaces;


import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.mark46.code.seattleplaces.Model.POJOs.MapItem;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.Utils.PresenterViewModel;

import java.util.List;


public class MapActivity extends FragmentActivity implements OnMapReadyCallback, ClusterManager.OnClusterItemInfoWindowClickListener {

    public static String ACTION_INTENT_FROM_MAPACTIVITY = "ACTION_INTENT_FROM_MAPACTIVITY";
    private GoogleMap mMap;
    private ProgressBar progressBar;
    private TextView message;
    private MapItem clickedClusterItem;
    // Declare a variable for the cluster manager.
    private ClusterManager<MapItem> mClusterManager;
    private List<ResponseData.ResponseBean.VenuesBean> venueList;
    private PresenterViewModel presenterViewModel;
    private MainPresenter mainPresenter;
    private Thread thread;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Initialize views
        progressBar = findViewById(R.id.progressBar_mapLoading);
        message = findViewById(R.id.textView_mapLoading);
        // Initialize ViewModel and build dagger
        presenterViewModel = ViewModelProviders.of(this).get(PresenterViewModel.class);
        mainPresenter = presenterViewModel.getMainPresenter();
        mainPresenter.buildDagger();
        // Initialize map
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        try {
            mapFragment.getMapAsync(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        venueList = SearchActivity.responseData.getResponse().getVenues();
    }


    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        progressBar.setVisibility(View.GONE);
        message.setVisibility(View.GONE);
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        LatLng center = new LatLng(47.60621, -122.33207);
        BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.mipmap.map_pin);
        mMap.addMarker(new MarkerOptions().position(center)
                .title("Center").icon(icon));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 10));
        if(venueList.size()>0) {
            setUpClusterer();
        }

    }


    /**
     *  Set up Clustered map
     */
    private void setUpClusterer() {
        // Position the map.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(venueList.get(0).getLocation().getLat(),
                        venueList.get(0).getLocation().getLng()), 12));

        // Initialize the manager with the context and the map.
        // (Activity extends context, so we can pass 'this' in the constructor.)
        mClusterManager = new ClusterManager<MapItem>(this, mMap);
        mMap.setOnMarkerClickListener(mClusterManager);
        mMap.setInfoWindowAdapter(mClusterManager.getMarkerManager());
        mMap.setOnInfoWindowClickListener(mClusterManager);
        mMap.setInfoWindowAdapter(mClusterManager.getMarkerManager());
        mMap.setOnInfoWindowClickListener(mClusterManager); //added
        mClusterManager.setOnClusterItemInfoWindowClickListener(this);
        // Action listener for when user clicks marker
        mClusterManager.setOnClusterItemClickListener(new ClusterManager.OnClusterItemClickListener<MapItem>() {
            @Override
            public boolean onClusterItemClick(MapItem mapItem) {
                clickedClusterItem = mapItem;
                return false;
            }
        });

        // Point the map's listeners at the listeners implemented by the cluster
        // manager.
        mMap.setOnCameraIdleListener(mClusterManager);
        mMap.setOnMarkerClickListener(mClusterManager);
        loadItems();
        mClusterManager.getMarkerCollection().setOnInfoWindowAdapter(
                new MyCustomAdapterForItems());

    }

    /**
     * Add all searched results in the map
     * @param title title of the marker
     * @param lat   lat position of marker
     * @param lng   lng position of marker
     * @param id    id of the place and it's position in the list
     */
    protected void addItems(String title, double lat, double lng, String id) {
        MapItem offsetItem = new MapItem(lat, lng, title, id);
        mClusterManager.addItem(offsetItem);
    }

    /**
     * Load items from list to clustered Manager
     */
    private void loadItems() {
         Runnable runnable= new Runnable() {
            @Override
            public void run() {
                int position = 0;
                for (ResponseData.ResponseBean.VenuesBean v : venueList) {
                    addItems(v.getName(), v.getLocation().getLat(), v.getLocation().getLng(), v.getId() + "_" + position);
                    position = position + 1;
                }


            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    /**
     *  Invoked when user clicked the title in the map. User is taken to Detail Activity.
     * @param clusterItem items or marker
     */
    @Override
    public void onClusterItemInfoWindowClick(ClusterItem clusterItem) {
        String[] snippet = clusterItem.getSnippet().split("_");
        String id = snippet[0];
        String position = snippet[1];
        Toast.makeText(this, position, Toast.LENGTH_SHORT).show();
        mainPresenter.requestDetailsAPIcall(id);
        Intent intent = new Intent(this, DetailActivity.class);
        intent.setAction(ACTION_INTENT_FROM_MAPACTIVITY);
        intent.putExtra("position", Integer.parseInt(position));
        startActivity(intent);

    }

    /**
     * Class that handles title and mSnippet in each item/marker in GoogleMaps.
     */
    public class MyCustomAdapterForItems implements GoogleMap.InfoWindowAdapter {

        private final View myContentsView;

        MyCustomAdapterForItems() {
            myContentsView = getLayoutInflater().inflate(
                    R.layout.info_window, null);
        }

        @Override
        public View getInfoWindow(Marker marker) {
            TextView tvTitle = ((TextView) myContentsView
                    .findViewById(R.id.txtTitle));
            tvTitle.setText(clickedClusterItem.getTitle());
            return myContentsView;
        }

        @Override
        public View getInfoContents(Marker marker) {
            return null;
        }
    }


}
