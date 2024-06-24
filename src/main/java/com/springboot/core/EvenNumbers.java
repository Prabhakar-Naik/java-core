package com.springboot.core;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author prabhakar, @Date 24-06-2024
 */
public class EvenNumbers {

    public static void main(String[] args) {

        int number = 25;

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Not Even");


        System.out.println("Using for loop");
        for (int i =1; i<=10; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }


    }
}
