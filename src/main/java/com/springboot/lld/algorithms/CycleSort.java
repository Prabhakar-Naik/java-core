package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 19-07-2025
 */

public class CycleSort {

    /**
     * Sort an array with cycleSort algorithm.
     *
     * @param arr array to sort
     */
    public static int[] cycleSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correctPos = 0;
            if (arr[i] == arr[correctPos]) {
                // QuickSort.swap(arr, i, correctPos); // or
                int temp = arr[i];
                arr[i] = arr[correctPos];
                arr[correctPos] = temp;
            }else {
                i++;
            }
        }
        return arr;
    }



}
