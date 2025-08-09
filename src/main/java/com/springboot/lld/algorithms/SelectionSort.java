package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 09-08-2025
 */

public class SelectionSort {

    /**
     * Sort an array with selectionSort algorithm.
     *
     * @param arr array to sort
     */

    public static void selectionSort(int[] arr) {
        var len = arr.length;

        for (var i = 0; i < len - 1; i++) {
            var minIndex = i;

            for (var j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            var tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }

    /**
     * Tests for {@link SelectionSort#selectionSort(int[])}.
     */
//    @Test
//    void testSelectionSort() {
//        var arr = new int[] {6, 3, 1, 5, 4, 2};
//        SelectionSort.selectionSort(arr);
//        assertEquals(6, arr.length);
//        assertEquals(1, arr[0]);
//        assertEquals(2, arr[1]);
//        assertEquals(3, arr[2]);
//        assertEquals(4, arr[3]);
//        assertEquals(5, arr[4]);
//        assertEquals(6, arr[5]);
//    }
}
