package com.springboot.designpatterns.creational.abstractfactory;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Usage
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
                Example: Creating UI elements for different operating systems (Windows/Mac buttons and checkboxes).
                """);
        GUIFactory windowsFactory = new WindowsFactory();
        Button winButton = windowsFactory.createButton();
        Checkbox winCheckbox = windowsFactory.createCheckbox();
        winButton.paint();
        winCheckbox.paint();

        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();
        macButton.paint();
        macCheckbox.paint();
    }
}
