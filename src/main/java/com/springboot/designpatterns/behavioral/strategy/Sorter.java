package com.springboot.designpatterns.behavioral.strategy;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Context
public class Sorter {

    private SortStrategy strategy;

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSort(int[] array) {
        if (strategy == null) {
            System.out.println("No sorting strategy set.");
            return;
        }
        strategy.sort(array);
    }
}

// Usage
// public class StrategyDemo {
//     public static void main(String[] args) {
//         int[] data1 = {5, 2, 8, 1, 9};
//         int[] data2 = {10, 4, 7, 3, 6};
//
//         Sorter sorter = new Sorter();
//
//         sorter.setSortStrategy(new BubbleSortStrategy());
//         System.out.println("Original Array 1: " + Arrays.toString(data1));
//         sorter.performSort(data1);
//         System.out.println("Sorted Array 1: " + Arrays.toString(data1));
//
//         System.out.println("\n---------------------\n");
//
//         sorter.setSortStrategy(new QuickSortStrategy());
//         System.out.println("Original Array 2: " + Arrays.toString(data2));
//         sorter.performSort(data2);
//         System.out.println("Sorted Array 2: " + Arrays.toString(data2));
//     }
// }