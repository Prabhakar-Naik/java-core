package com.springboot.designpatterns.structural.facade;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Subsystem 2
public class Amplifier {

    public void on() {
        System.out.println("Amplifier On");
    }
    public void setVolume(int volume) {
        System.out.println("Amplifier volume set to " + volume);
    }
    public void off() {
        System.out.println("Amplifier Off");
    }
}
