package com.springboot.designpatterns.structural.bridge;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Abstraction 1
public class BasicRemote extends Remote {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (device instanceof Tv) {
            if (((Tv) device).isOn()) { // Accessing internal state for demo
                device.turnOff();
            } else {
                device.turnOn();
            }
        } else { // Generic toggle
            System.out.println("Toggling power for basic remote.");
        }
    }

    @Override
    public void channelUp() {
        System.out.println("Basic remote: Channel Up not supported.");
    }

    @Override
    public void channelDown() {
        System.out.println("Basic remote: Channel Down not supported.");
    }

}
