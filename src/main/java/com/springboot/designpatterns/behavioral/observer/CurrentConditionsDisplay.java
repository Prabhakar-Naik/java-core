package com.springboot.designpatterns.behavioral.observer;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Observer 1 (Current Conditions Display)
public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherStation;

    public CurrentConditionsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
