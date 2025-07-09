package com.springboot.designpatterns.structural.decorator;

/**
 * @author prabhakar, @Date 05-07-2025
 */

// Concrete Component
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }

}
