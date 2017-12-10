package com.firsthead.observer;

/**
 * Created by zhongyi on 2017/12/10.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifiyObservers();
}
