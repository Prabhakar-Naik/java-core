package com.springboot.designpatterns.behavioral.observer;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class ObserverDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
                Example: A weather station (subject) notifying various displays (observers) about temperature changes.
                """);
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherStation);

        System.out.println("Setting initial measurements:");
        weatherStation.setMeasurements(80, 65, 30.4f);

        System.out.println("\nSetting new measurements:");
        weatherStation.setMeasurements(82, 70, 29.2f);

        System.out.println("\nRemoving Current Conditions Display:");
        weatherStation.removeObserver(currentDisplay);
        weatherStation.setMeasurements(78, 90, 29.5f);
    }
}
