package com.zzz.designPatterns.adapter;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 10:03
 */
public class NetworkCableConverter implements Adapter{
    Cable cable;

    NetworkCableConverter(Cable cable){
        this.cable = cable;
    }
    @Override
    public void toInternet() {
        cable.toInternet();
    }
}
