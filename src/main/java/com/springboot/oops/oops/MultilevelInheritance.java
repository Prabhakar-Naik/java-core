package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class MultilevelInheritance {

      /*
    Inheritance:
        Inheritance allows a new class (subclass) to inherit attributes and methods
        from an existing class (superclass). It promotes code reuse.
        Example:
            A SportsCar class can inherit from a Car class but also have its own features
            like turboMode.
    */

    /*
     Inheritance is a key concept in Object-Oriented Programming (OOP) that allows one class
      (child class) to inherit the properties and behaviors of another class (parent class).
    */

    /*
    Multilevel Inheritance
    A chain of inheritance where a class inherits from another class,
    and that class inherits from yet another class.
    Example:
        Vehicle → Car → SportsCar.
    */
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar();
        mySportsCar.start();  // Inherited from Vehicle
        mySportsCar.drive();  // Inherited from Car
        mySportsCar.turbo();  // SportsCar method
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("SportsCar is using turbo.");
    }
}

