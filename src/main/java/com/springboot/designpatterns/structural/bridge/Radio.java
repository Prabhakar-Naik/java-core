package com.springboot.designpatterns.structural.bridge;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Implementor 2
public class Radio implements Device {
    private boolean on = false;
    private double frequency = 88.5;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is OFF.");
    }

    @Override
    public void setChannel(int channel) { // Simulate channel as frequency
        this.frequency = 88.5 + channel * 0.5;
        System.out.println("Radio Frequency set to: " + this.frequency);
    }

    public int getChannel() {
        return (int) this.frequency;
    }

    public boolean isOn() {
        return on;
    }
}
