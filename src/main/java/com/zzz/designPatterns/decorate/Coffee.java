package com.zzz.designPatterns.decorate;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 14:06
 */
public class Coffee extends Drink {
    @Override
    Integer cost() {
        return 10;
    }

    @Override
    String name() {
        return "咖啡";
    }
}
