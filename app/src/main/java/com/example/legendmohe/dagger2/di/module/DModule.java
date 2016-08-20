package com.example.legendmohe.dagger2.di.module;

import com.example.legendmohe.dagger2.model.D;

import dagger.Module;
import dagger.Provides;

/**
 * Created by legendmohe on 16/8/20.
 */
@Module
public class DModule {

    @Provides
    public D provideD() {
        return new D();
    }
}
