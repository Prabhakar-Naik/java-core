package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class ArrayMedian {

    /**
     * Returns the median of the array.
     *
     * @param arr the array of integers (not null)
     * @return a double representing the median of the array
     */
    public static double arrayMedian(int[] arr) {
        Arrays.sort(arr);
        var mid = arr.length / 2;
        return arr.length % 2 != 0 ? (double) arr[mid] : (double) (arr[mid] + arr[mid-1]) / 2;
    }


    /**
     * Tests for {@link ArrayMedian#arrayMedian(int[])}.
     */

//    @Test
//    void testArrayMedian() {
//        assertEquals(11, ArrayMedian.arrayMedian(new int[]{4, 17, 2, 11, 29}));
//        assertEquals(4.5, ArrayMedian.arrayMedian(new int[]{9, 1, 11, 5, 3, 4}));
//        assertEquals(-11, ArrayMedian.arrayMedian(new int[]{-3, -1, -100, -11, -29}));
//        assertEquals(-11.5, ArrayMedian.arrayMedian(new int[]{1, -29, -14, -20, -9, -2}));
//    }

}
