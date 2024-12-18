package com.springboot.oops.oops;

    /*
    Encapsulation:
        Encapsulation involves bundling the data (attributes) and methods (functions)
        that operate on the data into a single unit (class). Access to this data is often
        restricted through access modifiers like private, public, and protected.
    */

/**
 * @author prabhakar, @Date 18-12-2024
 */
public class EncapsulatedCar {
    // Private fields (attributes)
    private String brand;
    private String color;
    private int speed;

    // Constructor to initialize attributes
    public EncapsulatedCar(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Getter and Setter methods for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter methods for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) { // Validating speed before setting
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}
