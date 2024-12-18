package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
//Example of Abstraction Using an Abstract Class
public class Abstraction1 {

    /*
    Abstraction:
        Abstraction hides implementation details and shows only the essential features
        of an object. This is often implemented using abstract classes or interfaces.
    Example:
        A Vehicle interface might define a method move() without specifying how it works,
        leaving that to specific implementations like Car or Bike.
    */

    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Animal animal = new Animal(); // This will cause an error

        // Using concrete subclasses
        AnimalA myDog = new DogA();
        myDog.sound();  // Output: Dog barks.
        myDog.eat();    // Output: This animal eats food.

        AnimalA myCat = new CatA();
        myCat.sound();  // Output: Cat meows.
        myCat.eat();    // Output: This animal eats food.
    }

}

// Abstract class
abstract class AnimalA {
    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method (has implementation)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1: Dog
class DogA extends AnimalA {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Subclass 2: Cat
class CatA extends AnimalA {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

