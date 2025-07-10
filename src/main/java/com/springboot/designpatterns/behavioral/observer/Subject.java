package com.springboot.designpatterns.behavioral.observer;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Observer.java
// Subject Interface
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
