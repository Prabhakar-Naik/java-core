package com.springboot.designpatterns.structural.bridge;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Abstraction (Remote interface)
public abstract class Remote {

    protected Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void channelUp();
    public abstract void channelDown();
}
