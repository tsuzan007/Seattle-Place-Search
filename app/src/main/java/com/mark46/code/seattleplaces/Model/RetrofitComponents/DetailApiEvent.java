package com.mark46.code.seattleplaces.Model.RetrofitComponents;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseDetail;

import java.util.List;

public class DetailApiEvent {

    private ResponseDetail response;

    //    Receives the List<Response> values from the FourSquareApiDataParser Event
    public DetailApiEvent(ResponseDetail response) {
        this.response = response;
    }

    //    Method to return the List<Response> value received from FourSquareApiDataParser
    public ResponseDetail getDetailResponse() {
        return response;
    }
}
