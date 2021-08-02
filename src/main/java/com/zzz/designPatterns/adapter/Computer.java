package com.zzz.designPatterns.adapter;

/**
 *  电脑
 * @author ZhaoZezhong
 * date 2021/7/29 9:30
 */
public class Computer {
    public void goOnline(Adapter adapter){
        adapter.toInternet();
    }
}
