package com.mark46.code.seattleplaces;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.mark46.code.seattleplaces.View.DetailFragment;



public class DetailActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mGoogleMap;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        DetailFragment detailFragment=new DetailFragment();
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout_detail,detailFragment);
        fragmentTransaction.commit();
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
        LatLng center=new LatLng(47.60621,-122.33207);
        mGoogleMap.addMarker(new MarkerOptions().position(center)
                .title("Center").icon(icon));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 10));

    }

    public void addplaceMarker(double lat, double lng){
        LatLng placelatlng=new LatLng(lat,lng);
        mGoogleMap.addMarker(new MarkerOptions().position(placelatlng)
                .title("place"));
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(placelatlng, 5));



    }
}
