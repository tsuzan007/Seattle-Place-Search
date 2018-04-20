package com.mark46.code.seattleplaces.Utils;

import android.arch.lifecycle.ViewModel;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of new Android App Architecture using ViewModel.
 */
public class PresenterViewModel extends ViewModel {
    List<ResponseData.ResponseBean.VenuesBean> venueData;

    private MainPresenter mainPresenter;

    public MainPresenter getMainPresenter() {
        if (mainPresenter != null) {
            return mainPresenter;
        } else {
            mainPresenter = new MainPresenter();
        }
        return mainPresenter;
    }

    //
    public List<ResponseData.ResponseBean.VenuesBean> getVenueData() {
        if (venueData != null) {
            return venueData;
        } else {
            return new ArrayList<ResponseData.ResponseBean.VenuesBean>();
        }
    }

    public void setVenueData(List<ResponseData.ResponseBean.VenuesBean> data) {
        venueData = data;

    }

}
