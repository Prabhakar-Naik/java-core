package com.springboot.oops.oops;

// JavaObject class to demonstrate the object
public class JavaObject {

    /*
    OOPS stands for Object-Oriented Programming System,
    a paradigm in software development that organizes data and behavior
    into reusable structures called objects. Object-oriented programming (OOP)
    is widely used in modern programming languages like Java, Python, C++, and C#.
    */

    /*
    Object:
    An object is an instance of a class. It represents a real-world entity
    with attributes (data) and methods (functions or behaviors).
    Example:
        A car can be an object with attributes like color, brand, and speed,
        and methods like start, stop, and accelerate.
    */

    public static void main(String[] args) {
        // Create an object (instance of the class)
        CarClassBluePrint myCar = new CarClassBluePrint("Toyota", "Red", 120);

        // Access the object's attributes and methods
        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Color: " + myCar.color);
        System.out.println("Speed: " + myCar.speed + " km/h");

        // Use the object's methods
        myCar.start();
        myCar.accelerate();
        myCar.stop();
    }
}
