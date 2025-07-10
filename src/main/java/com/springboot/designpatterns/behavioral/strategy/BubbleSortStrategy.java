package com.springboot.designpatterns.behavioral.strategy;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Strategy 1
public class BubbleSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap temp and array[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort.");
    }
}
