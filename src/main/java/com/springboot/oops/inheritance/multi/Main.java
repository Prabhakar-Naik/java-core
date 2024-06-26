package com.springboot.oops.inheritance.multi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 26-06-2024
 */
public class Main {

    public static void main(String[] args) {

        Altroze_Car car = new Altroze_Car();

        car.engine = "esuzi";
        car.cc = "300";
        car.ac ="available";
        car.doors = "4 doors";
        car.seating = "5 capacity";
        car.tires = "4 wheels";
        car.logo = "TATA";
        car.brand = "Altroze";
        car.milage = "30 km";
        car.store = "TATA Store";

        List<Altroze_Car> carList = new ArrayList<>();
        carList.add(car);
        System.out.println(carList);
    }
}
