package com.example.legendmohe.dagger2.di.module;

import java.util.Random;

import javax.inject.Inject;

/**
 * Created by legendmohe on 16/8/11.
 */
public class TestObject {
    public int id;

    public TestObject() {
        this.id = new Random().nextInt();
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "id=" + id +
                '}';
    }
}
