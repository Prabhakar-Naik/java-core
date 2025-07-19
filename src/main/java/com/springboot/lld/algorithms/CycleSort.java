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

    /**
     * Test for {@link CycleSort#cycleSort(int[])}.
     */
//    @Test
//    void testCycleSort() {
//        var arr = new int[] {6, 3, 1, 5, 4, 2};
//        CycleSort.cycleSort(arr);
//        assertEquals(6, arr.length);
//        assertEquals(1, arr[0]);
//        assertEquals(2, arr[1]);
//        assertEquals(3, arr[2]);
//        assertEquals(4, arr[3]);
//        assertEquals(5, arr[4]);
//        assertEquals(6, arr[5]);
//    }


}
