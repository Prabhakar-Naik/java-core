package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class ExecuteHere {

    static {
        System.out.println("1. static block");
    }

    {
        System.out.println("2. Instance Initializer Block");
    }

    ExecuteHere() {
        System.out.println("3. Constructor Block");
    }

    public static void main(String[] args) {
        System.out.println("4. Main Block Start");
        new ExecuteHere();
        System.out.println("5. Main Block End");
    }
}
