package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 09-08-2025
 */

public class QuickSort {

    /**
     * Sort an array with quicksort algorithm.
     *
     * @param arr   array to sort
     * @param left  left index where to begin sort (e.g. 0)
     * @param right right index where to end sort (e.g. array length - 1)
     */

    public static void quickSort(int[] arr, int left, int right) {
        var pivotIndex = left + (right - left) / 2;
        var pivotValue = arr[pivotIndex];
        var i = left;
        var j = right;

        while (i <= j) {
            while (arr[i] < pivotValue) {
                i++;
            }
            while (arr[j] > pivotValue) {
                j--;
            }
            if (i <= j) {
                var temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (left < i)
                quickSort(arr, left, i);
            if (right > i)
                quickSort(arr, i, right);
        }
    }


    /**
     * Tests for {@link QuickSort#quickSort(int[], int, int)}.
     */
//    @Test
//    void testQuickSort() {
//        var arr = new int[] {7, 13, 3, 1, 8, 5};
//        QuickSort.quickSort(arr, 0, arr.length - 1);
//        assertEquals(6, arr.length);
//        assertEquals(1, arr[0]);
//        assertEquals(3, arr[1]);
//        assertEquals(5, arr[2]);
//        assertEquals(7, arr[3]);
//        assertEquals(8, arr[4]);
//        assertEquals(13, arr[5]);
//    }
}
