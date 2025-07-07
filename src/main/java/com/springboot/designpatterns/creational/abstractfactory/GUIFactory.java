package com.springboot.designpatterns.creational.abstractfactory;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Abstract Factory
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
