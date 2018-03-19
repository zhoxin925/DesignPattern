package com.example.zx.designpattern.pattern.build;


/**
 * Created by zhouxin on 2018/3/2.
 */

public class BuilderClient {
    Builder builder = new ConcreateBuilder();
    Director director = new Director(builder);
    Product product = director.construct();

}
