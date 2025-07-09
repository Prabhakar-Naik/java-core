package com.springboot.designpatterns.structural.decorator;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Decorator 2
public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}

// Usage
// public class DecoratorDemo {
//     public static void main(String[] args) {
//         Coffee coffee = new SimpleCoffee();
//         System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());
//
//         Coffee milkCoffee = new MilkDecorator(coffee);
//         System.out.println("Cost: " + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());
//
//         Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
//         System.out.println("Cost: " + sugarMilkCoffee.getCost() + ", Description: " + sugarMilkCoffee.getDescription());
//     }
// }