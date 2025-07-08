package com.springboot.designpatterns.structural.bridge;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Abstraction 2
public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
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
            System.out.println("Toggling power for advanced remote.");
        }
    }


    @Override
    public void channelUp() {
        if (device instanceof Tv) {
            ((Tv) device).setChannel(((Tv) device).getChannel() + 1);
        } else if (device instanceof Radio) {
            ((Radio) device).setChannel(((Radio) device).getChannel() + 1); // Simulate channel change
        }
    }

    @Override
    public void channelDown() {
        if (device instanceof Tv) {
            ((Tv) device).setChannel(((Tv) device).getChannel() - 1);
        } else if (device instanceof Radio) {
            ((Radio) device).setChannel(((Radio) device).getChannel() - 1); // Simulate channel change
        }
    }
}


// Usage
// public class BridgeDemo {
//     public static void main(String[] args) {
//         Device tv = new Tv();
//         Device radio = new Radio();
//
//         Remote basicTvRemote = new BasicRemote(tv);
//         basicTvRemote.togglePower();
//         basicTvRemote.togglePower();
//
//         Remote advancedRadioRemote = new AdvancedRemote(radio);
//         advancedRadioRemote.togglePower();
//         advancedRadioRemote.channelUp();
//         advancedRadioRemote.channelUp();
//         advancedRadioRemote.togglePower();
//     }
// }