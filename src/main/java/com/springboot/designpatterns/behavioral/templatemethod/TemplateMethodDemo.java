package com.springboot.designpatterns.behavioral.templatemethod;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class TemplateMethodDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
                Example: Brewing beverages (tea, coffee). The steps are common, but specifics (e.g., adding condiments) differ.
                """);

        System.out.println("Preparing Coffee:");
        BeverageTemplate coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println("\nPreparing Tea:");
        BeverageTemplate tea = new Tea();
        tea.prepareBeverage();
    }
}
