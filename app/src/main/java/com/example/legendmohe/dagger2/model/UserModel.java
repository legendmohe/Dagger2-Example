package com.example.legendmohe.dagger2.model;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/9.
 */
public class UserModel {
    private String name;
    private String pwd;

    @Inject
    public UserModel(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
