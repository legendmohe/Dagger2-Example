package com.example.legendmohe.dagger2.di.module;

import com.example.legendmohe.dagger2.model.A;
import com.example.legendmohe.dagger2.model.B;
import com.example.legendmohe.dagger2.model.C;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by legendmohe on 16/8/19.
 */
@Module
public class ABCModule {
    @Provides
    @Singleton
    A provideA() {
        return new A();
    }

    @Provides
    B provideB(A a) {
        return new B(a);
    }

    @Provides
    C provideC(A a, B b) {
        return new C(a, b);
    }
}
