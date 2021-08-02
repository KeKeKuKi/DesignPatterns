package com.zzz.designPatterns.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 17:20
 */
@Data
public class WeatherDate implements Subject{
    float temperature;

    float humidity;

    List<Observer> observers;

    public void setData(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.notifyObservers();
    }

    WeatherDate(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(i -> i.update(this.temperature, this.humidity));
    }
}
