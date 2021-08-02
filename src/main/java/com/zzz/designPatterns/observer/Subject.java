package com.zzz.designPatterns.observer;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 17:01
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
