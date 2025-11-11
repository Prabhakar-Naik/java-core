package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class ConditionHere {

    public static void main(String[] args) {

        int x = 10;

        //if (x = 5) // compilation error
        if (x == 5)
            System.out.println("x is 5");
        else
            System.out.println("x is not 5");
    }
}
