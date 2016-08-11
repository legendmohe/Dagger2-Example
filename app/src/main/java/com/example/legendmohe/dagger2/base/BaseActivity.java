package com.example.legendmohe.dagger2.base;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.test.mock.MockApplication;

import com.example.legendmohe.dagger2.MyApplication;
import com.example.legendmohe.dagger2.di.component.ActivityComponent;
import com.example.legendmohe.dagger2.di.component.ApplicationComponent;
import com.example.legendmohe.dagger2.di.component.DaggerActivityComponent;
import com.example.legendmohe.dagger2.di.module.ActivityModule;
import com.example.legendmohe.dagger2.di.module.TestObject;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/11.
 */
public class BaseActivity extends AppCompatActivity {


    protected ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplicationComponent = ((MyApplication) getApplication()).getApplicationComponent();
//        mApplicationComponent.injectCommon(this);
//        DaggerActivityComponent.builder()
//                .activityModule(new ActivityModule(this))
//                .applicationComponent(mApplicationComponent)
//                .build();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
