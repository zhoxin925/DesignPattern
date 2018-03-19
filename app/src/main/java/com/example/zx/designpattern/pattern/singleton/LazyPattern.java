package com.example.zx.designpattern.pattern.singleton;

import android.provider.Settings;
import android.util.Log;

/**
 * Created by zhouxin on 2018/3/1.
 * 单例——懒汉模式
 * 线程不安全  开启多线程测试(testtool-->MyThread)
 */

public class LazyPattern {
    private static LazyPattern instance = new LazyPattern();

    private LazyPattern() { }

    public static LazyPattern getInstance() {
        if(instance==null) {
            instance = new LazyPattern();
        }
        return instance;
    }
}
