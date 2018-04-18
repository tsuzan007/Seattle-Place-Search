package com.mark46.code.seattleplaces.Utils.ConnectionUtils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * CheckNetwork class is a Internet checking class
 * It will check whether the device is receiving internet or not
 */

public class CheckNetwork implements ICheckNetwork {
    private Context context;

    public CheckNetwork(Context context) {
        this.context = context;
    }

    /**
     * Returns if internet connection is available in the device
     *
     * @return True if there is connection, false if the device is not connected to internet.
     */
    @Override
    public boolean getNetworkConnectionStatus() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        boolean isConnected = networkInfo != null && networkInfo.isConnectedOrConnecting();
        return isConnected;
    }
}
