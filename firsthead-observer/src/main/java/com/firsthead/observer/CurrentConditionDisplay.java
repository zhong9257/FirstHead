package com.firsthead.observer;

/**
 * Created by zhongyi on 2017/12/10.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{
    private Float temperature;
    private  Float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+this.temperature+" F degress and "+this.humidity+"% humidity");
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
