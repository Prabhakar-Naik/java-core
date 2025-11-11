package com.springboot.accessmodifiers.defaultmodifier;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class TestVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        int speed = vehicle.speed = 20;
        String name = vehicle.name = "Altroz";

        Vehicle vehicle1 = new Vehicle(name,speed);
        System.out.printf("%s and %d: ",vehicle1.name, vehicle1.speed);


    }
}
