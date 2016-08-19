package com.example.legendmohe.dagger2.di.module;

import android.app.Activity;

import com.example.legendmohe.dagger2.base.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by legendmohe on 16/8/11.
 */
@Module
public class BaseActivityModule {
    private final Activity activity;

    public BaseActivityModule(Activity activity) {
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
