package com.springboot.designpatterns.creational.abstractfactory;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

}

// Usage
// public class AbstractFactoryDemo {
//     public static void main(String[] args) {
//         GUIFactory windowsFactory = new WindowsFactory();
//         Button winButton = windowsFactory.createButton();
//         Checkbox winCheckbox = windowsFactory.createCheckbox();
//         winButton.paint();
//         winCheckbox.paint();
//
//         GUIFactory macFactory = new MacFactory();
//         Button macButton = macFactory.createButton();
//         Checkbox macCheckbox = macFactory.createCheckbox();
//         macButton.paint();
//         macCheckbox.paint();
//     }
// }