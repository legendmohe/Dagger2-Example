package com.example.legendmohe.dagger2.di.component;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.legendmohe.dagger2.MyApplication;
import com.example.legendmohe.dagger2.base.BaseActivity;
import com.example.legendmohe.dagger2.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/9.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Application application();

    void inject(Application app);

    void injectCommon(BaseActivity activity);
}
