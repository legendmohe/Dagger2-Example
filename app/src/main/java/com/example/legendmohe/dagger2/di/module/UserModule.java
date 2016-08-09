package com.example.legendmohe.dagger2.di.module;

import com.example.legendmohe.dagger2.model.UserModel;
import com.example.legendmohe.dagger2.model.UserProp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by legendmohe on 16/8/9.
 */
@Module
public class UserModule {

    @Provides
    public UserModel provideUserModel() {
        return new UserModel("test", "1010101");
    }

    @Provides
    public UserProp provideUserProp() {
        return new UserProp("device name");
    }
}
