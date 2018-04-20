package com.mark46.code.seattleplaces.Model.DaggerComponents;

import android.content.Context;

import com.mark46.code.seattleplaces.Model.RetrofitComponents.FourSquareApi;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.FourSquareApiDataParser;
import com.mark46.code.seattleplaces.Utils.ConnectionUtils.CheckNetwork;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Provides;
import retrofit2.Retrofit;

/**
 * MyApplicationDaggerModule is the  Dagger MyApplicationDaggerModule class
 * It contains all the Provide methods that will be Injected through Dagger Component
 */
@dagger.Module
public class MyApplicationDaggerModule {


    private final Context context;

    public MyApplicationDaggerModule(Context context) {
        this.context = context;
    }


    //    Method to get Context of the Application
    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }

    //    Method to get Retrofit instance from the FourSquareApi class
    @Singleton
    @Provides
    @Named("Real")
    public Retrofit providesRetrofitAdapter() {
        return new FourSquareApi().getRetrofitAdapter();
    }

    @Singleton
    @Provides
    @Named("Dummy")
    public Retrofit provideRetrofitForTesting() {
        return new FourSquareApi().getRetrofitForTesting();
    }


    @Singleton
    @Provides
    public FourSquareApiDataParser providesOpenNotifyDataParser() {
        return new FourSquareApiDataParser();
    }

    // Method to get the instance of the CheckNetwork class
    @Singleton
    @Provides
    public CheckNetwork providesInternetCheck(Context context) {
        return new CheckNetwork(context);
    }


}
