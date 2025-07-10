package com.springboot.designpatterns.behavioral.observer;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Observer 2 (Statistics Display)
public class StatisticsDisplay implements Observer {
    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    private Subject weatherStation;

    public StatisticsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

}

// Usage
// public class ObserverDemo {
//     public static void main(String[] args) {
//         WeatherStation weatherStation = new WeatherStation();
//
//         CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
//         StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherStation);
//
//         System.out.println("Setting initial measurements:");
//         weatherStation.setMeasurements(80, 65, 30.4f);
//
//         System.out.println("\nSetting new measurements:");
//         weatherStation.setMeasurements(82, 70, 29.2f);
//
//         System.out.println("\nRemoving Current Conditions Display:");
//         weatherStation.removeObserver(currentDisplay);
//         weatherStation.setMeasurements(78, 90, 29.5f);
//     }
// }