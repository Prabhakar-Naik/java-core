package com.springboot.core.basic;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class OddNumbers {

    public static void main(String[] args) {

        int number = 25;

        if (number % 2 != 0)
            System.out.println("Odd");
        else
            System.out.println("Not Odd");


        System.out.println("Using for loop");
        for (int i =1; i<=10; i++){
            if (i % 2 != 0)
                System.out.println(i);
        }


    }
}
