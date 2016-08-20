package com.example.legendmohe.dagger2.model;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/19.
 */
public class C {
    A a;
    B b;

    @Inject
    public C(A a, B b) {
        this.a = a;
        this.b = b;
    }
}
