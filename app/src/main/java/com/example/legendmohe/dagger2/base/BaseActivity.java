package com.example.legendmohe.dagger2.base;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.legendmohe.dagger2.MyApplication;
import com.example.legendmohe.dagger2.di.component.ApplicationComponent;
import com.example.legendmohe.dagger2.di.component.DaggerBaseActivityComponent;
import com.example.legendmohe.dagger2.di.module.BaseActivityModule;
import com.example.legendmohe.dagger2.di.module.TestObject;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/11.
 */
public class BaseActivity extends AppCompatActivity {
    @Inject
    TestObject mTestObject1;

    @Inject
    TestObject mTestObject2;

    @Inject
    protected SharedPreferences mSharedPreferences;

    protected ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplicationComponent = ((MyApplication) getApplication()).getApplicationComponent();
//        mApplicationComponent.injectCommon(this);
        DaggerBaseActivityComponent.builder()
                .baseActivityModule(new BaseActivityModule(this))
                .applicationComponent(mApplicationComponent)
                .build().inject(this);
    }
}
