package com.zzz.designPatterns.bridge;

import lombok.Data;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 11:01
 */
@Data
public class Computer implements Type{
    Brand brand;

    Computer(Brand brand){
        this.brand = brand;
    }

    @Override
    public void myType() {
        brand.myBrand();
        System.out.println("电脑");
    }
}
