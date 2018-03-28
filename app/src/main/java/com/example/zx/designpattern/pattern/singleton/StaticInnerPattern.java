package com.example.zx.designpattern.pattern.singleton;

/**
 * Created by zhouxin on 2018/3/1.
 * 静态内部类
 *
 * 比较推崇的一种单例写法
 * 优点：JVM本身机制保证了线程安全/没有性能缺陷
 * (无synchronized性能好 holder私有外部无法访问)  static/final
 */

public class StaticInnerPattern {

    private StaticInnerPattern() { }

    private static final class Holder {
        private static final StaticInnerPattern instance = new StaticInnerPattern();
    }

    public static StaticInnerPattern getInstance() {
        return Holder.instance;
    }
}
