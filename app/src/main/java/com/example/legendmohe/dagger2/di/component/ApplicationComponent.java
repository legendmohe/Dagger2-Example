package com.example.legendmohe.dagger2.di.component;

import com.example.legendmohe.dagger2.MyApplication;
import com.example.legendmohe.dagger2.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/9.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MyApplication app);
}
