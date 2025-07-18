package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class ArraySum {

    /**
     * Returns sum of the integers in the array.
     *
     * @param arr the array of integers (not null)
     * @return the sum of the elements from the array
     */

    public static int arraySum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    /**
     * Tests for {@link ArraySum#arraySum(int[])}.
     */
//    @Test
//    void testArraySum() {
//        assertEquals(47, ArraySum.arraySum(new int[]{2, 9, 10, 11, 15}));
//        assertEquals(-101, ArraySum.arraySum(new int[]{1, -10, 10, -100, -2}));
//    }


}
