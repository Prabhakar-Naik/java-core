package com.springboot.designpatterns.creational.prototype;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class PrototypeDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying this prototype.
                Example: Cloning a Car object instead of creating a new one from scratch.
                """);
        SportsCar originalCar = new SportsCar("Ferrari", "Red");
        originalCar.assemble();

        SportsCar clonedCar = (SportsCar) originalCar.clone();
        if (clonedCar != null) {
            clonedCar.setColor("Blue"); // Modify the cloned object
            clonedCar.assemble();

            originalCar.assemble(); // Original remains unchanged

            System.out.println("Are originalCar and clonedCar the same object? " + (originalCar == clonedCar));
        }

    }
}
