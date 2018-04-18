package com.mark46.code.seattleplaces.Model.RetrofitComponents;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseDetail;

import java.util.List;

public class DetailApiEvent {

    private ResponseDetail.ResponseBean.VenueBean response;

    //    Receives the List<Response> values from the FourSquareApiDataParser Event
    public DetailApiEvent(ResponseDetail.ResponseBean.VenueBean response) {
        this.response = response;
    }

    //    Method to return the List<Response> value received from FourSquareApiDataParser
    public ResponseDetail.ResponseBean.VenueBean getDetailResponse() {
        return response;
    }
}
