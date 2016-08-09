package com.example.legendmohe.dagger2.di.component;

import com.example.legendmohe.dagger2.di.module.UserModule;
import com.example.legendmohe.dagger2.model.UserModel;
import com.example.legendmohe.dagger2.model.UserProp;

import dagger.Component;

/**
 * Created by legendmohe on 16/8/9.
 */

@Component(modules = UserModule.class)
public interface UserComponent {
    UserModel getUserModel();

    UserProp getUserProp();
}
