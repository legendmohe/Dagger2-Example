package com.example.legendmohe.dagger2.di.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.legendmohe.dagger2.MyApplication;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by legendmohe on 16/8/9.
 */
@Module
public class ApplicationModule {
    private final MyApplication mApplication;

    @Inject
    public ApplicationModule(MyApplication application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    MyApplication provideApplication() {
        return this.mApplication;
    }

    // Dagger will only look for methods annotated with @Provides
    @Provides
    @Singleton
    // Application reference must come from AppModule.class
    SharedPreferences providesSharedPreferences(MyApplication application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
