package com.springboot.innerclasses.statics;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class Computer {

    // static nested class
    private String brand;
    private String model;

    private OperatingSystem os;

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs() {
        return os;
    }

    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void display() {
            System.out.println("USB Type: " + type);
        }
    }

    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void display() {
            System.out.println("Computer Model: " + model + " OS: " + osName);
        }
    }

}
