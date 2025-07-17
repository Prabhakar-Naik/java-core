package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class ArrayMean {

    /**
     * Returns the mean of the integers in the array.
     *
     * @param arr the array of integers (not null)
     * @return a double representing the mean of the array
     */
    public static double arrayMean(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }

    /**
     * Tests for {@link ArrayMean#arrayMean(int[])}.
     */

//    @Test
//    void testArrayMean() {
//        assertEquals(4.7, ArrayMean.arrayMean(new int[]{10, 9, 4, 1, 3, -11, 20, 6, 2, 3}));
//        assertEquals(-62.75, ArrayMean.arrayMean(new int[]{-30, -31, -63, -127}));
//    }


}
