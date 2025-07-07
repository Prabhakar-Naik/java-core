package com.springboot.designpatterns.creational.factorymethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
