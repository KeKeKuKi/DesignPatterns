package com.zzz.designPatterns.bridge;

/**
 *  苹果
 * @author ZhaoZezhong
 * date 2021/7/29 11:00
 */
public class Apple implements Brand{
    @Override
    public void myBrand() {
        System.out.print("------苹果");
    }
}
