package com.example.zx.designpattern.pattern.adapter.adapterObject;

/**
 * Created by zhouxin on 2018/3/2.
 */

public class MyClass {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
