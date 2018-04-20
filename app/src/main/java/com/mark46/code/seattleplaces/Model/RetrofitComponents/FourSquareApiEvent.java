package com.mark46.code.seattleplaces.Model.RetrofitComponents;


import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;

/**
 * FourSquareApiEvent is a model class used by the FourSquareApiDataParser class to create an event
 * and update the UI depending on the Network Response.
 */

public class FourSquareApiEvent {

    private ResponseData response;

    //    Receives the List<Response> values from the FourSquareApiDataParser Event
    public FourSquareApiEvent(ResponseData response) {
        this.response = response;
    }

    //    Method to return the List<Response> value received from FourSquareApiDataParser
    public ResponseData getListOfResponse() {
        return response;
    }
}
