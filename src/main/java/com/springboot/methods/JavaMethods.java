package com.springboot.methods;

/**
 * @author prabhakar, @Date 01-08-2024
 */
public class JavaMethods {

    // Constructor method

    JavaMethods() {
        System.out.println("Constructor method is called when an object of it's class is created");
    }

    // Main method where program execution begins

    public static void main(String[] args) {
        staticMethod();
        JavaMethods object = new JavaMethods();
        object.nonStaticMethod();
    }

    // Static method

    static void staticMethod() {
        System.out.println("Static method can be called without creating object");
    }

    // Non-static method

    void nonStaticMethod() {
        System.out.println("Non static method must be called by creating an object");
    }

}
