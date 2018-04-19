package com.mark46.code.seattleplaces;


import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.mark46.code.seattleplaces.Model.POJOs.MapItem;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.Utils.PresenterViewModel;

import java.util.List;
import java.util.Set;


public class MapActivity extends FragmentActivity implements OnMapReadyCallback,ClusterManager.OnClusterItemInfoWindowClickListener {

    private GoogleMap mMap;
    private ProgressBar progressBar;
    private TextView message;
    private MapItem clickedClusterItem;

    // Declare a variable for the cluster manager.
    private ClusterManager<MapItem> mClusterManager;
    private List<ResponseData.ResponseBean.VenuesBean> venueList;
    private PresenterViewModel presenterViewModel;
    private MainPresenter mainPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_map);
        progressBar=findViewById(R.id.progressBar_mapLoading);
        message=findViewById(R.id.textView_mapLoading);
        presenterViewModel = ViewModelProviders.of(this).get(PresenterViewModel.class);
        mainPresenter = presenterViewModel.getMainPresenter();
        mainPresenter.buildDagger();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        try {
            mapFragment.getMapAsync(this);
        }catch (Exception e){
            Log.e("....",e.toString());
        }
        venueList=SearchActivity.responseData.getResponse().getVenues();
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
    public void onMapReady(GoogleMap googleMap) {
        progressBar.setVisibility(View.GONE);
        message.setVisibility(View.GONE);
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        setUpClusterer();

    }

    private void setUpClusterer() {
        // Position the map.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(venueList.get(0).getLocation().getLat(), venueList.get(0).getLocation().getLng()), 10));

        // Initialize the manager with the context and the map.
        // (Activity extends context, so we can pass 'this' in the constructor.)
        mClusterManager = new ClusterManager<MapItem>(this, mMap);
        mMap.setOnMarkerClickListener(mClusterManager);
        mMap.setInfoWindowAdapter(mClusterManager.getMarkerManager());

        mMap.setOnInfoWindowClickListener(mClusterManager);
        mMap.setInfoWindowAdapter(mClusterManager.getMarkerManager());

        mMap.setOnInfoWindowClickListener(mClusterManager); //added
        mClusterManager.setOnClusterItemInfoWindowClickListener(this);
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

    protected void addItems(String title, double lat, double lng,String id) {
            MapItem offsetItem = new MapItem(lat, lng,title,id);
            mClusterManager.addItem(offsetItem);
    }


    private  void loadItems(){
       Runnable runnable=new Runnable() {
           @Override
           public void run() {
               for(ResponseData.ResponseBean.VenuesBean v:venueList){
                   addItems(v.getName(),v.getLocation().getLat(),v.getLocation().getLng(),v.getId());
               }


           }
       };
       new Thread(runnable).start();
    }



    @Override
    public void onClusterItemInfoWindowClick(ClusterItem clusterItem) {

        mainPresenter.requestDetailsAPIcall(clusterItem.getSnippet());
        Intent intent=new Intent(this,DetailActivity.class);
        startActivity(intent);

    }

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
