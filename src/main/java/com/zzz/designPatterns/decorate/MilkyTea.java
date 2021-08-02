package com.zzz.designPatterns.decorate;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 13:55
 */
public class MilkyTea extends Drink{
    @Override
    Integer cost() {
        return 8;
    }

    @Override
    String name() {
        return "奶茶";
    }
}
