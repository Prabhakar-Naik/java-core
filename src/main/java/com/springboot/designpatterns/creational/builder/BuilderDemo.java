package com.springboot.designpatterns.creational.builder;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class BuilderDemo {

    public static void main(String[] args) {

        System.out.println("""
                Concept: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
                Example: Building a House object with many optional parameters.
                """);
        House normalHouse = new House.HouseBuilder("Brick Walls", "Tile Roof")
                .withDoors("Wooden Doors")
                .withWindows("Glass Windows")
                .build();
        System.out.println(normalHouse);

        House luxuryHouse = new House.HouseBuilder("Concrete Walls", "Slate Roof")
                .withDoors("Steel Doors")
                .withWindows("Large Windows")
                .withGarage(true)
                .withSwimmingPool(true)
                .build();
        System.out.println(luxuryHouse);

    }
}
