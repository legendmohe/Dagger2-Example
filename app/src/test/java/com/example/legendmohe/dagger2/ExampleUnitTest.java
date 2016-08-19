package com.example.legendmohe.dagger2;

import android.util.Log;

import com.example.legendmohe.dagger2.di.component.ABCComponent;
import com.example.legendmohe.dagger2.di.component.DaggerABCComponent;
import com.example.legendmohe.dagger2.di.module.ABCModule;
import com.example.legendmohe.dagger2.model.A;
import com.example.legendmohe.dagger2.model.B;
import com.example.legendmohe.dagger2.model.C;

import org.junit.Test;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    private static final String TAG = "ExampleUnitTest";

    @Test
    public void addition_isCorrect() throws Exception {
        ABCComponent abcComponent = DaggerABCComponent.builder().aBCModule(new ABCModule()).build();
        A a = abcComponent.provideA();
        B b = abcComponent.provideB();
        C c = abcComponent.provideC();
        Log.d(TAG, "!!!");
    }
}