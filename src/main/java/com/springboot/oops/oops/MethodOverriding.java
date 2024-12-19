package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class MethodOverriding {

    /*
    Polymorphism:
        Polymorphism allows methods to perform differently based on the object calling them.
        It can be achieved through method overriding or method overloading.
    Example:
        A draw() method could behave differently for Circle and Rectangle objects.
    */

    /*
    Polymorphism allows the same method or function to behave differently based on the object that is invoking it. It is of two types:
    Compile-Time Polymorphism (Method Overloading)
    Run-Time Polymorphism (Method Overriding)
    */

    /*
    Run-Time Polymorphism (Method Overriding)
    In method overriding, a child class provides a specific implementation
    for a method already defined in the parent class.
    */

    public static void main(String[] args) {
        // Parent class reference pointing to a child class object
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();  // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.sound();  // Output: Cat meows
    }

}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}