package com.example.legendmohe.dagger2.model;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/19.
 */
public class B {
    A a;

    @Inject
    public B(A a) {
        this.a = a;
    }
}
