package com.springboot.core.dsa.search;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class BubbleSorting {

    public static void main(String[] args) {

        int size, i, j, temp;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of integers to sort");
        size = in.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " integers");

        for (i = 0; i < size; i++)
            array[i] = in.nextInt();

        for (i = 0; i < ( size - 1 ); i++) {
            for (j = 0; j < size - i - 1; j++) {
                /* For descending order use < */
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted list of numbers");

        for (i = 0; i < size; i++)
            System.out.print(array[i]+" ");
    }
}
