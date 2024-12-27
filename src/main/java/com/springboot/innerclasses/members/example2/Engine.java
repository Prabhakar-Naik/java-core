package com.springboot.innerclasses.members.example2;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class Engine {

    private NewCar newCar;

    public Engine(NewCar car){
        this.newCar = car;
    }
    public void start(){
        if (!newCar.isEngineOn()){
            newCar.setEngineOn(true);
            System.out.println(newCar.getModel()+ " engine started.");
        }else {
            System.out.println(newCar.getModel()+ " engine already on. ");
        }
    }

    public void stop(){
        if (newCar.isEngineOn()){
            newCar.setEngineOn( false);
            System.out.println(newCar.getModel()+ " engine stopped.");
        }else {
            System.out.println(newCar.getModel()+ " engine already off.");
        }
    }


}
