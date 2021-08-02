package com.zzz.designPatterns.builder;

/**
 * @author ZhaoZezhong
 * date 2021/7/28 17:17
 */
public class Worker implements Builder{

    Product product;

    public Worker(){
        product = new Product();
    }

    public void buildA() {
        product.setModelA("modelA");
        System.out.println("buildA");
    }

    public void buildB() {
        product.setModelB("modelB");
        System.out.println("buildB");
    }

    public void buildC() {
        product.setModelC("modelC");
        System.out.println("buildC");
    }

    public void buildD() {
        product.setModelD("modelD");
        System.out.println("buildD");
    }

    public Product build() {
        return product;
    }
}
