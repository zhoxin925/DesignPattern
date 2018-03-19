package com.example.zx.designpattern.pattern.adapter.adapterClass;

/**
 * Created by zhouxin on 2018/3/2.
 */

public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.print("sampleOperation2");
    }
}
