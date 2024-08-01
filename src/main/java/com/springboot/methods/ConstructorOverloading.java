package com.springboot.methods;

/**
 * @author prabhakar, @Date 01-08-2024
 */
public class ConstructorOverloading {

    String name;

    ConstructorOverloading() {
        System.out.println("Constructor method called.");
    }

    ConstructorOverloading(String t) {
        name = t;
    }

    public static void main(String[] args) {
        ConstructorOverloading construct  = new ConstructorOverloading();
        ConstructorOverloading java = new ConstructorOverloading("Java");

        construct.setName("C++");

        java.getName();
        construct.getName();
    }

    void setName(String t) {
        name = t;
    }

    void getName() {
        System.out.println("Language name: " + name);
    }

}
