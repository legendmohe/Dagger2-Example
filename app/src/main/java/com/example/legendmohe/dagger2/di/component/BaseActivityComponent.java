package com.example.legendmohe.dagger2.di.component;

import android.app.Activity;

import com.example.legendmohe.dagger2.base.BaseActivity;
import com.example.legendmohe.dagger2.base.PerActivity;
import com.example.legendmohe.dagger2.di.module.BaseActivityModule;
import com.example.legendmohe.dagger2.di.module.TestObject;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/11.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {BaseActivityModule.class})
public interface BaseActivityComponent {
    Activity activity();
    TestObject testObject();

    void inject(BaseActivity activity);
}
