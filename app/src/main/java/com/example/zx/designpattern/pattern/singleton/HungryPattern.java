package com.example.zx.designpattern.pattern.singleton;

/**
 * Created by zhouxin on 2018/3/1.
 * 单例——饿汉模式
 */

public class HungryPattern {
    private static HungryPattern instance = new HungryPattern();

    private HungryPattern() {
        //运行时还是会打印，无法对instance实例做延时加载；优化-懒汉模式
        System.out.print("单例模式—饿汉, 构造方法");
        System.out.print("\r\n");
    }

    public static HungryPattern getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HungryPattern.logprint();
    }
    public static void logprint() {
        //Log.d("单例模式—饿汉", "main");
        System.out.print("单例模式—饿汉, main");
    }
}
