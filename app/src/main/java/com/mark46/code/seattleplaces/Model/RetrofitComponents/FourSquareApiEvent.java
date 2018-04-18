package com.mark46.code.seattleplaces.Model.RetrofitComponents;


import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;

import java.util.List;

/**
 * FourSquareApiEvent is a model class used by the FourSquareApiDataParser class to create an event
 * and update the UI depending on the Network Response.
 */

public class FourSquareApiEvent {

    private List<ResponseData.ResponseBean.VenuesBean> response;

    //    Receives the List<Response> values from the FourSquareApiDataParser Event
    public FourSquareApiEvent(List<ResponseData.ResponseBean.VenuesBean> response) {
        this.response = response;
    }

    //    Method to return the List<Response> value received from FourSquareApiDataParser
    public List<ResponseData.ResponseBean.VenuesBean> getListOfResponse() {
        return response;
    }
}
