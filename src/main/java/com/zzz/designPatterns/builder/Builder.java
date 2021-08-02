package com.zzz.designPatterns.builder;

/**
 *  建造者
 *
 * @author ZhaoZezhong
 * date 2021/7/2817:07
 */
public interface Builder {
    void buildA();
    void buildB();
    void buildC();
    void buildD();

    Product build();

}
