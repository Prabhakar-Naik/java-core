package com.springboot.oops.inheritance.multi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 26-06-2024
 */
public class Altroze_Car extends TATA_Car{

    String brand;
    String milage;

    String store;

    public Altroze_Car() {
    }

    public Altroze_Car(String ac, String smartScreen, String seating, String logo) {
        super(ac, smartScreen, seating, logo);
    }

    public Altroze_Car(String engine, String cc, String doors, String tires, String ac, String smartScreen, String seating, String logo) {
        super(engine, cc, doors, tires, ac, smartScreen, seating, logo);
    }

    public Altroze_Car(String brand, String milage, String store) {
        this.brand = brand;
        this.milage = milage;
        this.store = store;
    }

    public Altroze_Car(String ac, String smartScreen, String seating, String logo, String brand, String milage, String store) {
        super(ac, smartScreen, seating, logo);
        this.brand = brand;
        this.milage = milage;
        this.store = store;
    }

    public Altroze_Car(String engine, String cc, String doors, String tires, String ac, String smartScreen, String seating, String logo, String brand, String milage, String store) {
        super(engine, cc, doors, tires, ac, smartScreen, seating, logo);
        this.brand = brand;
        this.milage = milage;
        this.store = store;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Altroze_Car{" +
                "brand='" + brand + '\'' +
                ", milage='" + milage + '\'' +
                ", store='" + store + '\'' +
                ", ac='" + ac + '\'' +
                ", smartScreen='" + smartScreen + '\'' +
                ", seating='" + seating + '\'' +
                ", logo='" + logo + '\'' +
                ", engine='" + engine + '\'' +
                ", cc='" + cc + '\'' +
                ", doors='" + doors + '\'' +
                ", tires='" + tires + '\'' +
                '}';
    }
}
