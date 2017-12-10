package com.firsthead.observer;

import com.firsthead.observer.CurrentConditionDisplay;
import com.firsthead.observer.WeatherData;

/**
 * Created by zhongyi on 2017/12/10.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80F,65F,30.4f);
        weatherData.setMeasurements(82F,70F,31.4f);
        weatherData.setMeasurements(78F,90F,29.4f);
    }
}
