package com.mark46.code.seattleplaces.Model.POJOs;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class MapItem implements ClusterItem {
    private final LatLng mPosition;
    private String mTitle;
    private String mSnippet;

    public MapItem(double lat, double lng, String mTitle, String mSnippet) {
        this.mTitle = mTitle;
        this.mSnippet = mSnippet;
        mPosition = new LatLng(lat, lng);
    }

    public MapItem(double lat, double lng){
        mPosition = new LatLng(lat, lng);
    }


    @Override
    public LatLng getPosition() {
        return mPosition;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }

    @Override
    public String getSnippet() {
        return null;
    }

}
