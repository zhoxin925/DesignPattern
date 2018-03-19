package com.example.zx.designpattern.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouxin on 2018/3/5.
 */

public abstract class Subject {
    //保存注册的观察者对象
    private List<Observer> obs = new ArrayList<>();

    public void attach(Observer observer) {
        obs.add(observer);
        System.out.print("attached an observer" + "\r\n");
    }

    public void detach(Observer observer) {
        obs.remove(observer);
    }

    public void notifyObservers(String newState) {
        for(Observer o : obs) {
            o.update(newState);
        }
    }
}
