package com.springboot.designpatterns.creational.prototype;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class SportsCar implements CarPrototype{

    private String model;
    private String color;

    public SportsCar(String model, String color) {
        this.model = model;
        this.color = color;
    }


    @Override
    public CarPrototype clone() {
        try {
            return (CarPrototype) super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Sports Car: " + model + ", Color: " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Usage
// public class PrototypeDemo {
//     public static void main(String[] args) {
//         SportsCar originalCar = new SportsCar("Ferrari", "Red");
//         originalCar.assemble();
//
//         SportsCar clonedCar = (SportsCar) originalCar.clone();
//         if (clonedCar != null) {
//             clonedCar.setColor("Blue"); // Modify the cloned object
//             clonedCar.assemble();
//
//             originalCar.assemble(); // Original remains unchanged
//
//             System.out.println("Are originalCar and clonedCar the same object? " + (originalCar == clonedCar));
//         }
//     }
// }