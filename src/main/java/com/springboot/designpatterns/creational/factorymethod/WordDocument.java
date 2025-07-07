package com.springboot.designpatterns.creational.factorymethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class WordDocument implements Document{


    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}
