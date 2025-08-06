package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 19-07-2025
 */

public class InsertionSort {

    /**
     * Sort an array with insertionSort algorithm.
     *
     * @param arr array to sort
     */

    public static void insertionSort(int[] arr) {
        for (var i = 1; i < arr.length; i++) {
            var temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    /**
     * Tests for {@link InsertionSort#insertionSort(int[])}.
     */

//    @Test
//    void testInsertionSort() {
//        var arr = new int[] {6, 3, 1, 5, 4, 2};
//        InsertionSort.insertionSort(arr);
//        assertEquals(6, arr.length);
//        assertEquals(1, arr[0]);
//        assertEquals(2, arr[1]);
//        assertEquals(3, arr[2]);
//        assertEquals(4, arr[3]);
//        assertEquals(5, arr[4]);
//        assertEquals(6, arr[5]);
//
//        assertNotEquals(7, arr.length);
//        assertNotEquals(2, arr[0]);
//        assertNotEquals(3, arr[1]);
//        assertNotEquals(4, arr[2]);
//        assertNotEquals(5, arr[3]);
//        assertNotEquals(6, arr[4]);
//        assertNotEquals(7, arr[5]);
//    }

}
