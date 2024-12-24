package com.springboot.keywords;

import java.util.List;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public interface Interfaces {

    //interface is a keyword
    // which is used to declare identity for a blueprint for class i.e (interface)

     // using interfaces we can achieve multiple inheritance and abstraction.
    // we can implement a class from more than one interface

    // by default interfaces have public abstract methods
    public abstract void eat();
    String ate();

    // by default interface members have public static final
    public static final int MAX_AGE = 200;
    int speed = 250;

    // interfaces has static methods and default methods

    // static method
    public static void info(){
        System.out.println("static method in interface");
    }

    static int myNumber(int a){
        return a;
    }

    // default methods
    public default void run(){
        System.out.println("default methods in interface");
    }

    default long employees(){
        return List.of(1,2,3,4,5).size();
    }


}
