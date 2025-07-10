package com.springboot.designpatterns.behavioral.observer;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Observer Interface
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}