package com.zzz.designPatterns.bridge;

/**
 *  联想
 * @author ZhaoZezhong
 * date 2021/7/29 10:59
 */
public class Lenovo implements Brand{
    @Override
    public void myBrand() {
        System.out.print("------联想品牌");
    }
}
