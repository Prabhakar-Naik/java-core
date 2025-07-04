package com.springboot.java21;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class SwitchPattern {

    static void identify(Object o) {
        switch (o) {
            case String s   -> System.out.println("String(" + s + ")");
            case Integer i  -> System.out.println("Integer(" + i + ")");
            default         -> System.out.println("Other");
        }
    }

    public static void main(String[] args) {
        identify("String");
        identify(23);
        identify('C');
    }
}
