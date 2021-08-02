package com.zzz.designPatterns.bridge;

import lombok.Data;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 11:07
 */
@Data
public class MobilePhone implements Type{
    Brand brand;

    MobilePhone(Brand brand){
        this.brand = brand;
    }

    @Override
    public void myType() {
        brand.myBrand();
        System.out.println("手机");
    }
}
