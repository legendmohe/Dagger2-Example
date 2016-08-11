package com.example.legendmohe.dagger2.di.component;

import android.app.Activity;

import com.example.legendmohe.dagger2.LoginActivity;
import com.example.legendmohe.dagger2.base.BaseActivity;
import com.example.legendmohe.dagger2.base.PerActivity;
import com.example.legendmohe.dagger2.di.module.ActivityModule;
import com.example.legendmohe.dagger2.di.module.TestObject;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/11.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    //Exposed to sub-graphs.
    LoginActivity activity();

    TestObject testObject();

    void injectActivity(LoginActivity activity);
}
