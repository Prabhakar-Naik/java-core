package com.springboot.java8.features;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class LambdaExample {

    public static void main(String[] args) {
        Adder adder = (x, y) -> x + y;
        //Adder adder2 = Integer::sum;
        System.out.println(adder.add(3, 4)); // 7
    }
}
