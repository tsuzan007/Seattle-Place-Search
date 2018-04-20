package com.mark46.code.seattleplaces.Utils;

import android.arch.lifecycle.ViewModel;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseDetail;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of new Android App Architecture using ViewModel.
 */
public class PresenterViewModel extends ViewModel {

    ResponseData responseData;
    ResponseDetail responseDetail;
    private MainPresenter mainPresenter;


    public ResponseDetail getResponseDetail() {
        if (responseDetail != null) {
            return responseDetail;
        } else {
            responseDetail = new ResponseDetail();
        }
        return responseDetail;
    }

    public void setResponseDetail(ResponseDetail responseDetail) {
        this.responseDetail = responseDetail;
    }

    public void setMainPresenter(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }



    public MainPresenter getMainPresenter() {
        if (mainPresenter != null) {
            return mainPresenter;
        } else {
            mainPresenter = new MainPresenter();
        }
        return mainPresenter;
    }

    //
    public ResponseData getResponseData() {
        if (responseData != null) {
            return responseData;
        } else {
            return new ResponseData();
        }
    }

    public void setResponseData(ResponseData data) {
        responseData = data;

    }

}
