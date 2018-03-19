package com.example.zx.designpattern.pattern.observer;

/**
 * Created by zhouxin on 2018/3/5.
 */

public class Test {
    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();
        ConcreateObserve observe = new ConcreateObserve();
        subject.attach(observe);
        subject.change("i change");
    }
}
