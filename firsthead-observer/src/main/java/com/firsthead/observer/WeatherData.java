package com.firsthead.observer;

import java.util.ArrayList;

/**
 * Created by zhongyi on 2017/12/10.
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>( );
    }


    public Float getHumidity() {
        return humidity;
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifiyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = observers.get(i);
            o.update(temperature,humidity,pressure);
        }

    }

    void measurementsChanged(){
        notifiyObservers();
    }

    public void setMeasurements(Float temperature,Float humidity,Float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
