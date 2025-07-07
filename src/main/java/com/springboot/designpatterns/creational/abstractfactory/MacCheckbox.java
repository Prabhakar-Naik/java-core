package com.springboot.designpatterns.creational.abstractfactory;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Product B2
public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Painting a Mac Checkbox.");
    }
}
