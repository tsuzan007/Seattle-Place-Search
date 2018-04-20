package com.mark46.code.seattleplaces.Model.DaggerComponents;


import com.mark46.code.seattleplaces.Model.RetrofitComponents.FourSquareApiDataParser;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.SearchActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {MyApplicationDaggerModule.class})
public interface MyApplicationDaggerComponent {

    void inject(MainPresenter mainPresenter);

    void inject(FourSquareApiDataParser FourSquareApiDataParser);

    void inject(SearchActivity searchActivity);

}
