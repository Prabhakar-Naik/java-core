package com.springboot.singleton;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class Student {

    static {
        System.out.println("Hello World");
        System.exit(0); // Prevents the JVM from looking for the `main` method
    }

}
