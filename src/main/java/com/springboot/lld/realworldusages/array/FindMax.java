package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class FindMax {

    /**
     * Returns the maximum integer from the array using reduction.
     *
     * @param arr the array of integers (not null)
     * @return the maximum element from the array
     */
    public static int findMax(int[] arr) {
        return Arrays.stream(arr).reduce(Integer.MIN_VALUE, Integer::max);
    }


    /**
     * Tests for {@link FindMax#findMax(int[])}.
     */
//    @Test
//    void test_findMax() {
//        assertEquals(9, FindMax.findMax(new int[] {1, 2, 4, 9, 8, 1}));
//        assertEquals(-8, FindMax.findMax(new int[] {-43, -23, -51, -10, -8, -65, -9}));
//        assertEquals(0, FindMax.findMax(new int[] {-4, -3, -2, -1, 0}));
//        assertEquals(1, FindMax.findMax(new int[] {1, 1, 1, 1, 1, 1}));
//    }

}
