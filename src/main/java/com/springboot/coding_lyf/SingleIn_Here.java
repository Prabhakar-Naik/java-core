package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */
class Vehicle{
    String type = "General Vehicle";

    void start(){
        System.out.println("Starting Vehicle");
    }
}

class Car extends Vehicle{
    String type = "Car";

    void start(){
        System.out.println("Starting Car");
    }
}

public class SingleIn_Here {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println("Type: "+vehicle.type);
        vehicle.start();
    }

}
