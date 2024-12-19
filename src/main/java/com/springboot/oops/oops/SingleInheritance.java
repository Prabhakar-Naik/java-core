package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class SingleInheritance {

      /*
    Inheritance:
        Inheritance allows a new class (subclass) to inherit attributes and methods
        from an existing class (superclass). It promotes code reuse.
        Example:
            A SportsCar class can inherit from a Car class but also have its own features
            like turboMode.
    */

    /*
     * Inheritance is a key concept in Object-Oriented Programming (OOP) that allows one class
     *  (child class) to inherit the properties and behaviors of another class (parent class).
     */

    /*
    Single Inheritance
    A child class inherits from one parent class.
    Example:
        Parent class: Vehicle
        Child class: Car inherits Vehicle
    */

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Inherited method
        myCar.drive();  // Child class method
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}