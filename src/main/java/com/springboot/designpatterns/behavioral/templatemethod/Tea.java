package com.springboot.designpatterns.behavioral.templatemethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Class 2 (Tea)
public class Tea extends BeverageTemplate{

    @Override
    protected void brew() {
        System.out.println("Steeping the tea bag.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon.");
    }
}

// Usage
// public class TemplateMethodDemo {
//     public static void main(String[] args) {
//         System.out.println("Preparing Coffee:");
//         BeverageTemplate coffee = new Coffee();
//         coffee.prepareBeverage();
//
//         System.out.println("\nPreparing Tea:");
//         BeverageTemplate tea = new Tea();
//         tea.prepareBeverage();
//     }
// }