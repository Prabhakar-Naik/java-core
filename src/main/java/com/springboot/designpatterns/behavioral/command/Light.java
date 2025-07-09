package com.springboot.designpatterns.behavioral.command;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Receiver
public class Light {

    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
