package com.springboot.keywords;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class Modifiers {

    // abstract: Used to declare a class or method that must be implemented in a subclass (cannot be instantiated).
    abstract class Shape {
        abstract void draw();
    }

    // final: Prevents a class from being subclassed, a method from being overridden, or a variable from being reassigned.
    final int MAX_VALUE = 100;

    // static: Indicates that a field, method, or nested class belongs to the class rather than an instance.
    static int count = 0;

    // strictfp: Ensures consistent floating-point calculations across platforms.
    strictfp class Calculator {
        double calculate() {
            return 0.1 + 0.2;
        }
    }

    //transient: Prevents a field from being serialized during object serialization.
    transient int sessionId;

    //volatile: Marks a variable as being stored in main memory to ensure visibility across threads.
    volatile boolean running = true;


}
