package com.zzz.designPatterns.builder;

/**
 * 指挥
 *
 * @author ZhaoZezhong
 * date 2021/7/28 17:25
 */
public class Director {
    public Product build(Builder builder){
        builder.buildA();

        builder.buildC();

        builder.buildD();

        builder.buildB();

        return builder.build();
    }
}
