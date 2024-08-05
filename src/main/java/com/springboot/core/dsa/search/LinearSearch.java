package com.springboot.core.dsa.search;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class LinearSearch {

    public static void main(String[] args) {

        int size, i, array[], search;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        size = in.nextInt();
        array = new int[size];

        System.out.println("Enter " + size + " integers");

        for (i = 0; i < size; i++)
            array[i] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (i = 0; i < size; i++) {
            if (array[i] == search)     /* Searching element is present */ {
                System.out.println(search + " is present at location " + (i + 1) + ".");
                break;
            }
        }
        if (i == size)  /* Searching element is absent */
            System.out.println(search + " is not present in array.");



    }
}
