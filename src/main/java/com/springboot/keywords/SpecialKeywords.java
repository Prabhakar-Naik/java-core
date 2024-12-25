package com.springboot.keywords;

import com.springboot.accessmodifiers.privatemodifier.Animal;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class SpecialKeywords {
    static int x = 2;
    static String obj;



    public static void main(String[] args) {

        //assert: Used for debugging purposes, to check an assumption or condition at runtime.

        assert x > 0 : "x should be positive";

        //instanceof: Tests whether an object is an instance of a specific class or implements an interface.
        if (obj instanceof String) {
            System.out.println("It's a string!");
        }

        //implements: Indicates that a class implements an interface.
        class MyClass implements Runnable { public void run() {} }

        //extends: Indicates that a class is inheriting from a superclass or an interface is extending another interface.
        //class Dog extends Animal { }


    }
}
