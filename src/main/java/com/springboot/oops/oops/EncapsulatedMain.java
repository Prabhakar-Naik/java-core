package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class EncapsulatedMain {

    public static void main(String[] args) {
        // Creating an object of the Car class
        EncapsulatedCar myCar = new EncapsulatedCar("Toyota", "Red", 120);

        // Accessing and modifying attributes using getter and setter methods
        System.out.println("Initial Car Details:");
        myCar.displayDetails();

        System.out.println("\nUpdating Car Details:");
        myCar.setBrand("Honda");
        myCar.setColor("Blue");
        myCar.setSpeed(150);

        // Displaying updated car details
        myCar.displayDetails();

        // Attempting to set an invalid speed
        System.out.println("\nSetting invalid speed:");
        myCar.setSpeed(-10);
    }
}
