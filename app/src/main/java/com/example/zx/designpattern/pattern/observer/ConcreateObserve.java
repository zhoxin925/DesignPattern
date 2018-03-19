package com.example.zx.designpattern.pattern.observer;

/**
 * Created by zhouxin on 2018/3/5.
 */

public class ConcreateObserve implements Observer {
    //观察者状态
    private String newSate;

    @Override
    public void update(String newState) {
        //更新观察者状态，让他与目标状态一致
        this.newSate = newState;
        System.out.print("ConcreateObserve update newState: " + newState + "\r\n");
    }
}
