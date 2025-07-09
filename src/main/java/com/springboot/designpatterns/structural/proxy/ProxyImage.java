package com.springboot.designpatterns.structural.proxy;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Proxy
public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage; // Lazy initialization

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Load only when needed
        }
        realImage.display();
    }
}

// Usage
// public class ProxyDemo {
//     public static void main(String[] args) {
//         Image image1 = new ProxyImage("photo1.jpg");
//         Image image2 = new ProxyImage("photo2.jpg");
//
//         System.out.println("First call to image1.display():");
//         image1.display(); // Loads from disk
//
//         System.out.println("\nSecond call to image1.display():");
//         image1.display(); // Does not load again
//
//         System.out.println("\nFirst call to image2.display():");
//         image2.display(); // Loads from disk
//     }
// }