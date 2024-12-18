package com.springboot.oops.oops;

/**
 * @author prabhakar, @Date 18-12-2024
 */
// Example of Abstraction Using an Interface
public class Abstraction2 {

    /*
    Abstraction:
        Abstraction hides implementation details and shows only the essential features
        of an object. This is often implemented using abstract classes or interfaces.
    Example:
        A Vehicle interface might define a method move() without specifying how it works,
        leaving that to specific implementations like Car or Bike.
    */

    public static void main(String[] args) {
        // Using interface references for objects
        VehicleA myCar = new CarB();
        myCar.start();  // Output: Car is starting.
        myCar.stop();   // Output: Car is stopping.

        VehicleA myBike = new BikeB();
        myBike.start(); // Output: Bike is starting.
        myBike.stop();  // Output: Bike is stopping.
    }


}

// Interface
interface VehicleA {
    void start(); // Abstract method
    void stop();  // Abstract method
}

// Class 1: Car implements Vehicle
class CarB implements VehicleA {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

// Class 2: Bike implements Vehicle
class BikeB implements VehicleA {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}
