package com.mark46.code.seattleplaces.Model.RetrofitComponents;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * FourSquareApi is responsible for building the Retrofit with the static part of URL.
 */

public class FourSquareApi {
    //    Static part of URL to make the network call.
    public static String Base = "https://api.foursquare.com/v2/venues/";
    private Retrofit retrofit;

    public static ExecutorService newSynchronousExecutorService() {
        return new AbstractExecutorService() {

            private boolean shutingDown = false;
            //
            private boolean terminated = false;


            @Override
            public void shutdown() {
                this.shutingDown = true;
                this.terminated = true;
            }

            @NonNull
            @Override
            public List<Runnable> shutdownNow() {
                return new ArrayList<>();
            }

            @Override
            public boolean isShutdown() {
                return this.shutingDown;
            }

            @Override
            public boolean isTerminated() {
                return this.terminated;
            }

            @Override
            public boolean awaitTermination(long l, @NonNull TimeUnit timeUnit) throws InterruptedException {
                return false;
            }

            @Override
            public void execute(@NonNull Runnable runnable) {
                runnable.run();
            }
        };
    }

    public Retrofit getRetrofitAdapter() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        retrofit = new Retrofit.Builder()
                .baseUrl(Base)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    public Retrofit getRetrofitForTesting() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient();
        Dispatcher dispatcher = new Dispatcher(newSynchronousExecutorService());
        httpClient.newBuilder().dispatcher(dispatcher);

        retrofit = new Retrofit.Builder()
                .baseUrl(Base)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}
