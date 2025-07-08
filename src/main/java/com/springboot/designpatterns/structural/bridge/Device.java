package com.springboot.designpatterns.structural.bridge;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Bridge.java
// Implementor (Device interface)
public interface Device {

    void turnOn();
    void turnOff();
    void setChannel(int channel);
}
