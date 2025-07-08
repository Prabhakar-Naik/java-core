package com.springboot.designpatterns.structural.bridge;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Implementor 1
public class Tv implements Device {
    private boolean on = false;
    private int channel = 1;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is OFF.");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV Channel set to: " + this.channel);
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

}
