package com.mark46.code.seattleplaces.Model.RetrofitComponents;


import android.util.Log;

import com.mark46.code.seattleplaces.Model.DaggerComponents.MyApplicationDaggerBuild;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseDetail;

import org.greenrobot.eventbus.EventBus;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * FourSquareApiDataParser is used to pass the latitude and longitude values of the device location
 * to make the network call and get the required response from network.
 */

public class FourSquareApiDataParser {

    @Inject
    @Named("Real")
    Retrofit retrofitAdapter;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();
    String v = sdf.format(date);
    private FourSquareApiInterface FourSquareApiInterface;
    private String clientid = "PNGRBEBSB0FW5I1F54BGSKXFRKPOARABODX4XLERTUYSYUW0";
    private String clientsecret = "ACFA1DZH01XFFUNMN0VTQGXWVY22SSNXCWSC30DCFR3AWCRN";


    public FourSquareApiDataParser() {
        MyApplicationDaggerBuild.getMyApplicationDaggerBuild().getMyApplicationDaggerComponent().inject(this);
        getRetrofitClientReference();
    }

    // Creating the reference for the FourSquareApiInterface
    public void getRetrofitClientReference() {
        this.FourSquareApiInterface = retrofitAdapter.create(FourSquareApiInterface.class);
    }

    /**
     * Make a asynchronous call to the given API endpoint.
     */
    public void getJSONDataFromAPI(String searchquery) {

        //
        Call<ResponseData> call = FourSquareApiInterface.getPlaces(clientid, clientsecret, "Seattle,WA", searchquery, v);

        // Making the network call
        call.enqueue(new Callback<ResponseData>() {

            // Method that execute when call is successful
            @Override
            public void onResponse(Call<ResponseData> call, retrofit2.Response<ResponseData> response) {

                // checking the Network Response for any Error
                if (response.errorBody() != null) {
                    Log.e("Response Body error", "Error-" + response.body().toString());
                } else {

                    // Event that passes the response to presenter and make necessary update on UI
                    EventBus.getDefault().post(new FourSquareApiEvent(response.body()));

                }
            }

            // Method that execute when call is Failed
            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

                Log.e("406", "Failed" + t.getMessage().toString());
                // Event that passes the OnFailure response to presenter and make necessary update on UI
                EventBus.getDefault().post(new FourSquareApiFailureEvent("Connection Failed.Internet is not available."));
            }
        });
    }

    /**
     * Make a asynchronous call to the given API endpoint.
     */
    public void getPlaceDetailsFromAPI(String id) {

        //
        Call<ResponseDetail> call = FourSquareApiInterface.getPlaceDetails(id, clientid, clientsecret, v);

        // Making the network call
        call.enqueue(new Callback<ResponseDetail>() {

            // Method that execute when call is successful
            @Override
            public void onResponse(Call<ResponseDetail> call, retrofit2.Response<ResponseDetail> response) {

                // checking the Network Response for any Error

                if (response.errorBody() != null) {
                    Log.e("Response Body error", "Error-" + response.body().toString());
                } else {

                    // Event that passes the response to presenter and make necessary update on UI
                    EventBus.getDefault().post(new DetailApiEvent(response.body()));

                }
            }

            // Method that execute when call is Failed
            @Override
            public void onFailure(Call<ResponseDetail> call, Throwable t) {

                Log.e("406", "Failed" + t.getMessage().toString());
                // Event that passes the OnFailure response to presenter and make necessary update on UI
                EventBus.getDefault().post(new FourSquareApiFailureEvent("Connection Failed.Internet is not available."));
            }
        });
    }
}
