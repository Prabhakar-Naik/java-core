package com.springboot.innerclasses.members.example2;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class NewCarTest {

    public static void main(String[] args) {

        NewCar car = new NewCar("Tayota");
        Engine engine = new Engine(car);
        engine.start();
        engine.start();

        car = new NewCar("Lambo");
        engine = new Engine(car);
        engine.start();
        engine.start();

    }
}
