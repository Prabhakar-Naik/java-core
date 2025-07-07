package com.springboot.designpatterns.creational.abstractfactory;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Product A1
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting a Windows Button.");
    }
}
