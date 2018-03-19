package com.example.zx.designpattern.pattern.singleton.testtool;

import com.example.zx.designpattern.pattern.singleton.LazyPattern;

/**
 * Created by zhouxin on 2018/3/1.
 * 测试懒汉模式的线程不安全
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        //我怎么测试都是一个实例呢？？？？？
        System.out.print("单例模式—懒汉, MyThread：hashCode=" + LazyPattern.getInstance().hashCode());
        System.out.print("\r\n");
    }

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[50];
        for(int i=0;i<myThreads.length;i++) {
            myThreads[i] = new MyThread();
        }

        for(int j=0;j<myThreads.length;j++) {
            myThreads[j].start();
        }
    }
}
