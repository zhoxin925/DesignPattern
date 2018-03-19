package com.example.zx.designpattern.pattern.adapter.adapterObject;

/**
 * Created by zhouxin on 2018/3/2.
 */

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.print("o-sampleOperation2");
    }
}
