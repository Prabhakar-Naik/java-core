package com.springboot.core.datatypes;

import java.util.stream.DoubleStream;

/**
 * @author prabhakar, @Date 13-09-2024
 */
public class DoubleProgram {
    public static void main(String[] args) {


        // Store single value type data type
        double a = 10, b = 20, c = 30;
        System.out.println(" Store single value type data type  " + a + " " + b + " " + c);

        //store multiple values type same data type
        //Array creation
        double arr[];

        //Array declaration
        arr = new double[5];

        //Array initialization
        //Arrays are index based starts from 0(zero)
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        //Array Access using indexes...
        System.out.println("Approach 1 for printing: ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("Approach 2 for printing using for loop: ");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        System.out.println("Approach 3 for printing using forEach loop: ");
        for (double ar : arr)
            System.out.println(ar);

        System.out.println("Approach 4 for printing using while loop: ");
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        // for copy

        System.out.println("Approach 5 for printing using Streams from 1.8 version of java: ");
        //DoubleStream.of(arr).forEach(n -> System.out.println(n)); //or
        DoubleStream.of(arr).forEach(System.out::println);
    }
}
