package com.example.legendmohe.dagger2.di.component;

import com.example.legendmohe.dagger2.di.module.ABCModule;
import com.example.legendmohe.dagger2.model.A;
import com.example.legendmohe.dagger2.model.B;
import com.example.legendmohe.dagger2.model.C;
import com.example.legendmohe.dagger2.model.D;
import com.example.legendmohe.dagger2.model.Main;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/19.
 */
@Component(modules = ABCModule.class, dependencies = DComponent.class)
public interface ABCComponent {
    A provideA();

    B provideB();

    C provideC();

    D provideD();

    void inject(Main main);
}
