package com.springboot.designpatterns.structural.facade;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Facade.java
// Subsystem 1
public class DvdPlayer {

    public void on() {
        System.out.println("DVD Player On");
    }
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
    public void off() {
        System.out.println("DVD Player Off");
    }
}
