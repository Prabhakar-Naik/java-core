package com.springboot.innerclasses.members.example1;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class NewCarTest {

    public static void main(String[] args) {
        NewCar car =  new NewCar("Tata Safari");

        NewCar.Engine engine = car.new Engine();

        engine.start();
        engine.stop();


    }
}
