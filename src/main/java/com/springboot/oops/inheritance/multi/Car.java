package com.springboot.oops.inheritance.multi;

/**
 * @author prabhakar, @Date 26-06-2024
 */
public class Car {
    String engine;
    String cc;
    String doors;
    String tires;

    public Car() {
    }

    public Car(String engine, String cc, String doors, String tires) {
        this.engine = engine;
        this.cc = cc;
        this.doors = doors;
        this.tires = tires;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", cc='" + cc + '\'' +
                ", doors='" + doors + '\'' +
                ", tires='" + tires + '\'' +
                '}';
    }
}
