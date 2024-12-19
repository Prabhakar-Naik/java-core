package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class MethodOverloading {

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
    Compile-Time Polymorphism (Method Overloading)
    In method overloading, multiple methods in the same class
    have the same name but different parameters.
    */

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using overloaded methods
        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 4.5));
    }

}

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}