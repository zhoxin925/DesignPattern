package com.example.zx.designpattern.pattern.singleton;

/**
 * Created by zhouxin on 2018/3/1.
 * 双重检查加锁DCL
 *
 * volatile  synchronized
 * volatile java1.4前的版本会导致加锁失效
 */

public class DoubleCheckLock {
    private volatile static DoubleCheckLock instance;

    private DoubleCheckLock() {}

    public static DoubleCheckLock getInstance() {
        if(instance==null) {
            synchronized (DoubleCheckLock.class) {
                if(instance==null) {
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
