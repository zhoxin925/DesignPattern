package com.example.zx.designpattern.pattern.singleton;

/**
 * Created by zhouxin on 2018/3/1.
 */

public class LazySafetyPattern {
    private static LazySafetyPattern instance = new LazySafetyPattern();

    private LazySafetyPattern() { }

    //1、方法中声明synchronized关键字
    public static synchronized LazySafetyPattern getInstance() {
        if(instance==null) {
            instance = new LazySafetyPattern();
        }
        return instance;
    }

    //2、同步代码块实现
    public static LazySafetyPattern getInstance1() {
        synchronized (LazySafetyPattern.class) {
            if(instance==null) {
                instance = new LazySafetyPattern();
            }
        }
        return instance;
    }
}
