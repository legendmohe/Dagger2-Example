package com.example.legendmohe.dagger2.model;

import android.util.Log;

import com.example.legendmohe.dagger2.di.component.ABCComponent;
import com.example.legendmohe.dagger2.di.component.DComponent;
import com.example.legendmohe.dagger2.di.component.DaggerABCComponent;
import com.example.legendmohe.dagger2.di.component.DaggerDComponent;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/20.
 */
public class Main {

    @Inject
    C c;

    @Inject
    D d;

    private static final String TAG = "Main";

    public Main() {
        DComponent dComponent = DaggerDComponent.create();
        D d1 = dComponent.provideD();

        ABCComponent abcComponent = DaggerABCComponent
                .builder()
                .dComponent(dComponent)
                .build();
//        A a = abcComponent.provideA();
//        B b = abcComponent.provideB();
//        C c1 = abcComponent.provideC();
//        D d2 = abcComponent.provideD();
        abcComponent.inject(this);
        Log.d(TAG, "!!!!");
    }
}
