package com.example.legendmohe.dagger2.di.component;

import android.app.Application;
import android.content.SharedPreferences;

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

    SharedPreferences sharePreferences();
}
