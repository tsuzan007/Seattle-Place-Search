package com.mark46.code.seattleplaces.Model.DaggerComponents;

import android.app.Application;

public class MyApplicationDaggerBuild extends Application {

    private static MyApplicationDaggerBuild myApplicationDaggerBuild;
    private MyApplicationDaggerComponent myApplicationDaggerComponent;


    public static MyApplicationDaggerBuild getMyApplicationDaggerBuild() {
        return myApplicationDaggerBuild;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplicationDaggerBuild = this;
        myApplicationDaggerComponent = DaggerMyApplicationDaggerComponent.builder()
                .myApplicationDaggerModule(new MyApplicationDaggerModule(this))
                .build();
    }


    public MyApplicationDaggerComponent getMyApplicationDaggerComponent() {
        return myApplicationDaggerComponent;
    }
}
