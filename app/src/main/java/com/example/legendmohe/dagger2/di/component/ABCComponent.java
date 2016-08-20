package com.example.legendmohe.dagger2.di.component;

import com.example.legendmohe.dagger2.model.A;
import com.example.legendmohe.dagger2.model.B;
import com.example.legendmohe.dagger2.model.C;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/19.
 */
@Singleton
@Component()
public interface ABCComponent {
    A provideA();

    B provideB();

    C provideC();
}
