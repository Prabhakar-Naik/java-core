package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class HierarchicalInheritance {

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
    Hierarchical Inheritance
    Multiple child classes inherit from the same parent class.
    Example:
        Parent class: Vehicle.
        Child classes: MyCar, Bike.
    */

    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.start();  // Inherited method
        myCar.drive();

        Bike myBike = new Bike();
        myBike.start();  // Inherited method
        myBike.ride();
    }

}

class MyCar extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}