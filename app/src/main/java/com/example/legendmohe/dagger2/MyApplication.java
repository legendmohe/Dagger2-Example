package com.example.legendmohe.dagger2;

import android.app.Application;

import com.example.legendmohe.dagger2.di.component.ApplicationComponent;
import com.example.legendmohe.dagger2.di.component.DaggerApplicationComponent;
import com.example.legendmohe.dagger2.di.module.ApplicationModule;

/**
 * Created by legendmohe on 16/8/9.
 */
public class MyApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
