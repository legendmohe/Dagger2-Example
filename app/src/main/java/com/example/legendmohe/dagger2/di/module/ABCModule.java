package com.example.legendmohe.dagger2.di.module;

import com.example.legendmohe.dagger2.model.A;
import com.example.legendmohe.dagger2.model.B;
import com.example.legendmohe.dagger2.model.C;

import dagger.Module;
import dagger.Provides;

/**
 * Created by legendmohe on 16/8/19.
 */
@Module
public class ABCModule {
    @Provides
    public A provideA() {
        return new A();
    }

    @Provides
    public B provideB(A a) {
        return new B(a);
    }

    @Provides
    public C provideC(A a, B b) {
        return new C(a, b);
    }
}
