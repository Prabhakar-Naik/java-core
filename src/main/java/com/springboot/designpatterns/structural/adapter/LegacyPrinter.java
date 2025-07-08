package com.springboot.designpatterns.structural.adapter;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Adaptee (the incompatible class)
public class LegacyPrinter {

    public void printText(String text) {
        System.out.println("Legacy Printer: " + text);
    }
}
