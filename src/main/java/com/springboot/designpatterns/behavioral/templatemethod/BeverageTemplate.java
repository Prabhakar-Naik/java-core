package com.springboot.designpatterns.behavioral.templatemethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// TemplateMethod.java
// Abstract Class (Abstract Beverage)
public abstract class BeverageTemplate {
    // Template method - defines the algorithm's skeleton
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments(); // Hook method - subclasses may override or do nothing
    }

    protected void boilWater() {
        System.out.println("Boiling water.");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    // Abstract methods - to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();
}