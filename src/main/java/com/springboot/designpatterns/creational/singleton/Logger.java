package com.springboot.designpatterns.creational.singleton;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Singleton.java
public class Logger {
    private static Logger instance;

    // Private constructor to prevent direct instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Public static method to provide the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: "+message);
    }

}

// Usage
// public class SingletonDemo {
//     public static void main(String[] args) {
//         Logger logger1 = Logger.getInstance();
//         Logger logger2 = Logger.getInstance();
//
//         logger1.log("This is the first log message.");
//         logger2.log("This is the second log message.");
//
//         System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
//     }
// }
