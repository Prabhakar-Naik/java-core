package com.springboot.designpatterns.behavioral.templatemethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Class 1 (Coffee)
public class Coffee extends BeverageTemplate{

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }
}
