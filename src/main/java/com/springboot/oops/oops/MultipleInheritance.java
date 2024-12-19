package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class MultipleInheritance {

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
    Multiple Inheritance (Not supported in Java with classes, but achievable via interfaces)
    A child class inherits from more than one parent class.
    Java prevents this with classes to avoid ambiguity (Diamond Problem),
    but it supports it through interfaces.
    */

    public static void main(String[] args) {
        OurCar ourCar = new OurCar();
        ourCar.startEngine();
        ourCar.rollWheels();
    }

    /*
    Hybrid Inheritance (Combination of different inheritance types;
    not directly supported in Java but achievable using interfaces)
    A mix of hierarchical and multiple inheritance. This can be simulated using interfaces.
    */
}

interface Engine {
    void startEngine();
}

interface Wheels {
    void rollWheels();
}

class OurCar implements Engine, Wheels {
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void rollWheels() {
        System.out.println("Car wheels are rolling.");
    }
}