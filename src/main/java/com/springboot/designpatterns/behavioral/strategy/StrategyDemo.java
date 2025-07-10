package com.springboot.designpatterns.behavioral.strategy;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class StrategyDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
                Example: Different sorting algorithms (bubble sort, quick sort) for a collection.
                """);
        int[] data1 = {5, 2, 8, 1, 9};
        int[] data2 = {10, 4, 7, 3, 6};

        Sorter sorter = new Sorter();

        sorter.setSortStrategy(new BubbleSortStrategy());
        System.out.println("Original Array 1: " + Arrays.toString(data1));
        sorter.performSort(data1);
        System.out.println("Sorted Array 1: " + Arrays.toString(data1));

        System.out.println("\n---------------------\n");

        sorter.setSortStrategy(new QuickSortStrategy());
        System.out.println("Original Array 2: " + Arrays.toString(data2));
        sorter.performSort(data2);
        System.out.println("Sorted Array 2: " + Arrays.toString(data2));
    }
}
