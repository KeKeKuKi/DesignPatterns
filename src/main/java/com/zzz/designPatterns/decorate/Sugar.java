package com.zzz.designPatterns.decorate;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 14:08
 */
public class Sugar extends Decorate{
    @Override
    Integer cost() {
        return 1;
    }

    @Override
    String name() {
        return "糖";
    }
}
