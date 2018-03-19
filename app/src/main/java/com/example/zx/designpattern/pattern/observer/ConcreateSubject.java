package com.example.zx.designpattern.pattern.observer;

/**
 * Created by zhouxin on 2018/3/5.
 */

public class ConcreateSubject extends Subject {
    private String newSate;

    public String getState() {
        return newSate;
    }

    public void change(String state) {
        this.newSate = state;
        System.out.print("ConcreateSubject state: " + state + "\r\n");

        //状态改变，通知观察者
        notifyObservers(newSate);
    }
}
