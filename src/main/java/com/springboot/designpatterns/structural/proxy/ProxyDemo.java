package com.springboot.designpatterns.structural.proxy;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class ProxyDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Provides a surrogate or placeholder for another object to control access to it.
                Example: Image loading. A ProxyImage can load a real image only when it's actually displayed.
                """);
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("First call to image1.display():");
        image1.display(); // Loads from disk

        System.out.println("\nSecond call to image1.display():");
        image1.display(); // Does not load again

        System.out.println("\nFirst call to image2.display():");
        image2.display(); // Loads from disk
    }
}
