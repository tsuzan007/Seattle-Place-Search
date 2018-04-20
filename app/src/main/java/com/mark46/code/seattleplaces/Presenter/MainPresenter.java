package com.mark46.code.seattleplaces.Presenter;


import com.mark46.code.seattleplaces.Model.DaggerComponents.MyApplicationDaggerBuild;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.FourSquareApiDataParser;

import javax.inject.Inject;

/**
 * MainPresenter is the Presenter class that is responsible to communicate between UI and model classes .
 */

public class MainPresenter {


    //Injecting the Dagger values
    @Inject
    FourSquareApiDataParser fourSquareApiDataParser;


    public MainPresenter() {

    }

    public void buildDagger() {
        // Injecting the Dagger Component so that the Dagger provided values can be used.
        MyApplicationDaggerBuild.getMyApplicationDaggerBuild().getMyApplicationDaggerComponent().inject(this);

    }


    /**
     *  Request venue based on the query
     * @param query search text given by the user
     */
    public void startSearch(String query) {
        fourSquareApiDataParser.getJSONDataFromAPI(query);
    }

    /**
     * Request detail information of selected place
     * @param id id of the place/venue
     */
    public void requestDetailsAPIcall(String id) {
        fourSquareApiDataParser.getPlaceDetailsFromAPI(id);

    }


}
