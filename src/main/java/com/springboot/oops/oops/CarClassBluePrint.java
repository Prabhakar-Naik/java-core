package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */ // Define a class
class CarClassBluePrint {

    /*
    Class:
    A class is a blueprint for creating objects. It defines the structure (attributes)
    and behaviors (methods) of objects.
    Example:
        A Car class can define attributes like color and brand and methods like start()
        or stop() or accelerate().
    */

    // Attributes (fields)
    String brand;
    String color;
    int speed;

    // Constructor to initialize attributes
    CarClassBluePrint(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Method to start the car
    void start() {
        System.out.println("The " + color + " " + brand + " car has started.");
    }

    // Method to stop the car
    void stop() {
        System.out.println("The " + color + " " + brand + " car has stopped.");
    }

    // Method to accelerate the car
    void accelerate() {
        System.out.println("The " + color + " " + brand + " car is accelerating at " + speed + " km/h.");
    }
}
