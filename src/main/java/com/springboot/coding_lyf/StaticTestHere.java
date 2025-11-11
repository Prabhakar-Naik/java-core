package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class StaticTestHere {

    static {
        System.out.println("1. static block");
    }

    static int x = initializeX();

    public static int initializeX() {
        System.out.println("2. static method initializeX");
        return 7;
    }

    public static void main(String[] args) {
        System.out.println("3. Main method: x = "+ x);
    }
}
