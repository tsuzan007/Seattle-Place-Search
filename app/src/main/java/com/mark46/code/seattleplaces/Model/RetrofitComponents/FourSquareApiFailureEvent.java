package com.mark46.code.seattleplaces.Model.RetrofitComponents;



public class FourSquareApiFailureEvent {

    private String onFailureResponse;

    //    Receives the onFailure Response from the FourSquareApiDataParser Failure Event
    public FourSquareApiFailureEvent(String onFailureResponse) {
        this.onFailureResponse = onFailureResponse;
    }

    //    Method to return the onFailure Response received from FourSquareApiDataParser
    public String getOnFailureResponse() {
        return onFailureResponse;
    }
}
