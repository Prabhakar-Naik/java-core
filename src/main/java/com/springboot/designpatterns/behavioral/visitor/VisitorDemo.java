package com.springboot.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class VisitorDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Represents an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
                Example: Calculating the total price of items in a shopping cart, or printing details of different shapes.
                """);
        List<ItemElement> items = new ArrayList<>();
        items.add(new Book(20, "12345"));
        items.add(new Book(100, "98765"));
        items.add(new Fruit(10, 2, "Apple"));
        items.add(new Fruit(5, 5, "Orange"));

        ShoppingCartPriceCalculator calculator = new ShoppingCartPriceCalculator();

        for (ItemElement item : items) {
            item.accept(calculator);
        }

        System.out.println("\nTotal Cost of Shopping Cart: " + calculator.getTotalCost());

    }
}
