package com.mark46.code.seattleplaces.Utils.LocationServicesUtils;

import android.content.Context;
import android.location.LocationManager;

public class CheckLocationServices implements ICheckLocationServices {

    private Context context;

    public CheckLocationServices(Context context) {
        this.context = context;
    }

    @Override
    public boolean checkLocationServices() {
        LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        boolean gps_enabled = false;
        boolean network_enabled = false;

        try {
            gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch (Exception ex) {
        }

        try {
            network_enabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        } catch (Exception ex) {
        }

        if (!gps_enabled && !network_enabled) {
            // notify user
            return false;
        }
        return true;
    }
}
