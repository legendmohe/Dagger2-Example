package com.example.legendmohe.dagger2.di.module;

import android.app.Activity;

import com.example.legendmohe.dagger2.base.PerActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by legendmohe on 16/8/11.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    Activity activity() {
        return this.activity;
    }

    @Provides
    @PerActivity
    TestObject provideTestObject() {
        return new TestObject();
    }
}
