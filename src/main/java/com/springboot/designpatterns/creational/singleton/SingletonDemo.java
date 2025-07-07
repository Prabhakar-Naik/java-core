package com.springboot.designpatterns.creational.singleton;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class SingletonDemo {

    public static void main(String[] args) {

        System.out.println("""
                Concept: Ensures a class has only one instance and provides a global point of access to it.
                Example: A logging utility.
                """);

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        System.out.println(STR."Are logger1 and logger2 the same instance? \{logger1 == logger2}");
    }
}
