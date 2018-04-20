package com.mark46.code.seattleplaces.Model;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;

import java.util.List;

public class MyIntentService extends IntentService {


    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     * <p>
     * <p>
     * <p>
     * private List<ResponseData.ResponseBean.VenuesBean> venueList;
     */
    private List<ResponseData.ResponseBean.VenuesBean> venueList;

    public MyIntentService() {
        super("my Intentservice");
    }


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
//        for (ResponseData.ResponseBean.VenuesBean v: venueList){
//            Log.e("....",v.getName());
////            addItems(v.getName(),v.getLocation().getLat(),v.getLocation().getLng());
//
//        }

        Log.e("......", "in intent ");

    }
}
