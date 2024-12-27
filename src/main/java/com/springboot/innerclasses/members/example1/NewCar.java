package com.springboot.innerclasses.members.example1;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class NewCar {

    // member inner class
    private String model;
    private boolean isEngineOn;

    public NewCar(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    // this is also one member in the NewCar Class

    class Engine{
        void start(){
            if (!isEngineOn){
                isEngineOn = true;
                System.out.println(model+ " engine started.");
            }else {
                System.out.println(model+ " engine already on. ");
            }
        }

        void stop(){
            if (isEngineOn){
                isEngineOn = false;
                System.out.println(model+ " engine stopped.");
            }else {
                System.out.println(model+ " engine already off.");
            }
        }


    }
}
