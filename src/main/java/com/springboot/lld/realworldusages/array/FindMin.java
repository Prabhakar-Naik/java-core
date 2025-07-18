package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class FindMin {


    /**
     * Returns the minimum integer from the array using reduction.
     *
     * @param arr the array of integers (not null)
     * @return the minimum element from the array
     */
    public static int findMin(int[] arr) {
        return Arrays.stream(arr).reduce(Integer.MAX_VALUE, Integer::min);
    }


    /**
     * Tests for {@link FindMin#findMin(int[])}.
     */
//    @Test
//    void test_findMin() {
//        assertEquals(1, FindMin.findMin(new int[] {1, 2, 4, 9, 8, 1}));
//        assertEquals(-65, FindMin.findMin(new int[] {-43, -23, -51, -10, -8, -65, -9}));
//        assertEquals(-4, FindMin.findMin(new int[] {-4, -3, -2, -1, 0}));
//        assertEquals(1, FindMin.findMin(new int[] {1, 1, 1, 1, 1, 1}));
//    }


}
