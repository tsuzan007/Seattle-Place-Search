package com.mark46.code.seattleplaces;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mark46.code.seattleplaces.View.DetailFragment;


public class DetailActivity extends AppCompatActivity implements OnMapReadyCallback {

    FragmentManager fragmentManager;
    DetailFragment detailFragment;
    private GoogleMap mGoogleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        boolean value = false;
        int position = 0;
        try {
            if (intent.getAction() == MapActivity.ACTION_INTENT_FROM_MAPACTIVITY) {
                position = intent.getIntExtra("position", 0);
                value = SearchActivity.responseData.getResponse().getVenues().get(position).isFavourite();

            } else if (intent.getAction() == SearchActivity.ACTION_INTENT_FROM_SEARCHACTIVITY) {
                value = intent.getBooleanExtra("isfab", false);
                position = intent.getIntExtra("position", 0);

            }
        } catch (NullPointerException e) {

        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isfavourite", value);
        bundle.putInt("position", position);
        detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout_detail, detailFragment);
        fragmentTransaction.commit();


    }

    @Override
    protected void onStop() {
        super.onStop();

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        mGoogleMap.getUiSettings().setZoomGesturesEnabled(true);
        mGoogleMap.getUiSettings().setZoomControlsEnabled(true);
        BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.mipmap.map_pin);
        LatLng center = new LatLng(47.60621, -122.33207);
        LatLng place = new LatLng(detailFragment.getLat(), detailFragment.getLng());
        Log.e("...", place.toString());
        mGoogleMap.addMarker(new MarkerOptions().position(center)
                .title("Center").icon(icon));
        mGoogleMap.addMarker(new MarkerOptions().position(place)
                .title("place"));
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place, 15));


    }


}
