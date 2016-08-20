package com.example.legendmohe.dagger2.di.component;

import com.example.legendmohe.dagger2.di.module.DModule;
import com.example.legendmohe.dagger2.model.D;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/20.
 */
@Component(modules = DModule.class)
public interface DComponent {
    D provideD();
}
