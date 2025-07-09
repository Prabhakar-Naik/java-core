package com.springboot.designpatterns.structural.decorator;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class DecoratorDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Attaches new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
                Example: Adding functionalities (e.g., milk, sugar) to a Coffee.
                """);

        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sugarMilkCoffee.getCost() + ", Description: " + sugarMilkCoffee.getDescription());
    }
}
