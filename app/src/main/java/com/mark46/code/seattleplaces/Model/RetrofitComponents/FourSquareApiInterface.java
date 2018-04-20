package com.mark46.code.seattleplaces.Model.RetrofitComponents;


import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseDetail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * FourSquareApiInterface is the client interface for the Retrofit instance.
 * It contains dynamic part of the URL and methods to complete the network call.
 */

public interface FourSquareApiInterface {
    //GET SEARCHES
    @GET("search/?")
    Call<ResponseData> getPlaces(@Query("client_id") String clientID, @Query("client_secret") String clientSecret, @Query("near") String address, @Query("query") String search, @Query("v") String date);

    //GET DETAILS
    @GET("{VENUE_ID}/?")
    Call<ResponseDetail> getPlaceDetails(@Path("VENUE_ID") String venueID, @Query("client_id") String clientID, @Query("client_secret") String clientSecret, @Query("v") String date);

}