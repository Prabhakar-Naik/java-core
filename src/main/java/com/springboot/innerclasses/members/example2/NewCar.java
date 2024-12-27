package com.springboot.innerclasses.members.example2;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class NewCar {

    private String model;
    private boolean isEngineOn;

    public NewCar(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel() {
        return model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

}
