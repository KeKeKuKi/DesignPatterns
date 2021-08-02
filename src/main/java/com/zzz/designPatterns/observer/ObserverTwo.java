package com.zzz.designPatterns.observer;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 17:10
 */
public class ObserverTwo implements Observer{
    float temperature;

    float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        show();
    }

    private void show(){
        System.out.println("二号监听器：监测天气变化！--------- temperature：" + temperature + "  humidity" + humidity);
    }
}
