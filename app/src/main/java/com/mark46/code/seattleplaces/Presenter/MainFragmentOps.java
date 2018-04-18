package com.mark46.code.seattleplaces.Presenter;


import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;

import java.util.List;

public interface MainFragmentOps {
  public void onSuccessOpenNotifyApiResponse(List<ResponseData.ResponseBean.VenuesBean> venuesBeanList);

    public void onFailureOpenNotifyApiResponse(String onFailureResponse);
}
