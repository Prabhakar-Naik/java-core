package com.springboot.java17;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class PatternInstanceof {

    static void printLength(Object o) {
        if (o instanceof String s) {
            System.out.println(s.length());
        } else {
            System.out.println("Not a string");
        }
    }

    public static void main(String[] args) {
        printLength("JUnit");
        printLength(123);
    }
}
