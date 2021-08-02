package com.zzz.designPatterns.decorate;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 14:03
 */
public class Fruit extends Decorate{
    @Override
    Integer cost() {
        return 2;
    }

    @Override
    String name() {
        return "果粒";
    }
}
