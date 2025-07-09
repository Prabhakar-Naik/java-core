package com.springboot.designpatterns.structural.decorator;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Decorator 1
public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
