package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 18-07-2025
 */

public class BinarySearch {

    /**
     * Search an item with binarySearch algorithm.
     *
     * @param arr sorted array to search
     * @param item an item to search
     * @return if item is found, return the index position of the array item otherwise return -1
     */
    public static int binarySearch(int[] arr, int left, int right, int item) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == item) {
                return mid;
            }

            if (arr[mid] > item) {
                return binarySearch(arr, left, mid - 1, item);
            }
            return binarySearch(arr, mid + 1, right, item);
        }
        return -1;
    }


    /**
     * Tests for {@link BinarySearch#binarySearch(int[], int, int, int)}.
     */

//    @Test
//    void testBinarySearch() {
//        int[] arr = new int[]{1, 5, 33, 40, 45, 51, 68, 75, 78, 123, 180, 256, 300, 312};
//        assertEquals(4, BinarySearch.binarySearch(arr, 0, arr.length - 1, 45));
//
//        int[] arr2 = new int[]{1, 1, 4, 4, 8, 8, 90, 100, 111, 550, 621};
//        assertEquals(2, BinarySearch.binarySearch(arr2, 0, arr2.length - 1, 4));
//
//        int[] arr3 = new int[]{4, 9, 14, 71, 330, 400, 411, 556};
//        assertEquals(-1, BinarySearch.binarySearch(arr3, 0, arr3.length - 1, 6));
//    }

}
