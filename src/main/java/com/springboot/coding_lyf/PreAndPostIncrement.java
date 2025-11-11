package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class PreAndPostIncrement {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("Default X value = " + x);
        x = x++ + ++x;
        System.out.println("Current X value = " + x);
    }
}
