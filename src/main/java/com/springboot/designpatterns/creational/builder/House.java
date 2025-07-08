package com.springboot.designpatterns.creational.builder;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Builder.java
public class House {
    private String walls;
    private String roof;
    private String doors;
    private String windows;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    // Private constructor to force use of the Builder
    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", roof=" + roof + ", doors=" + doors +
                ", windows=" + windows + ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool + "]";
    }

    public static class HouseBuilder {
        private String walls;
        private String roof;
        private String doors;
        private String windows;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder(String walls, String roof) { // Mandatory parameters
            this.walls = walls;
            this.roof = roof;
        }

        public HouseBuilder withDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder withWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder withGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder withSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}

// Usage
// public class BuilderDemo {
//     public static void main(String[] args) {
//         House normalHouse = new House.HouseBuilder("Brick Walls", "Tile Roof")
//                                     .withDoors("Wooden Doors")
//                                     .withWindows("Glass Windows")
//                                     .build();
//         System.out.println(normalHouse);
//
//         House luxuryHouse = new House.HouseBuilder("Concrete Walls", "Slate Roof")
//                                     .withDoors("Steel Doors")
//                                     .withWindows("Large Windows")
//                                     .withGarage(true)
//                                     .withSwimmingPool(true)
//                                     .build();
//         System.out.println(luxuryHouse);
//     }
// }
