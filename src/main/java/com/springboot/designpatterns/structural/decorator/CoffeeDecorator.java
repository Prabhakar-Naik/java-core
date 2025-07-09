package com.springboot.designpatterns.structural.decorator;

/**
 * @author prabhakar, @Date 05-07-2025
 */

// Decorator Abstract Class
public abstract class CoffeeDecorator implements Coffee{

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

}
