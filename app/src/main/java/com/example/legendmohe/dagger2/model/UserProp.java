package com.example.legendmohe.dagger2.model;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/9.
 */
public class UserProp {
    String deviceName;

    @Inject
    public UserProp(String deviceName) {
        this.deviceName = deviceName;
    }
}
