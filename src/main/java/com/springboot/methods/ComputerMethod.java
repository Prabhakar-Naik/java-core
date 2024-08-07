package com.springboot.methods;

/**
 * @author prabhakar, @Date 01-08-2024
 */
public class ComputerMethod {
    ComputerMethod() {
        System.out.println("Constructor of ComputerMethod class.");
    }
    void computer_method() {
        System.out.println("Power gone! Shut down your PC soon...");
    }
    public static void main(String[] args) {
        ComputerMethod my = new ComputerMethod();
        Laptop lap = new Laptop();
        my.computer_method();
        lap.laptop_method();
    }
}

class Laptop {
    Laptop() {
        System.out.println("Constructor of Laptop class.");
    }
    void laptop_method() {
        System.out.println("99% Battery available.");
    }
}
