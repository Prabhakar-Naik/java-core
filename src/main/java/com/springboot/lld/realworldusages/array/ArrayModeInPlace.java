package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class ArrayModeInPlace {

    /**
     * Returns the mode of the array.
     *
     * @param array array to find mode in it
     * @return mode of array
     */

    public static int modeArrayInPlace(int[] array) {
        if (array.length == 0)
            return 0;

        Arrays.sort(array);

        int mode = array[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            }else {
                if (count > maxCount) {
                    maxCount = count;
                    mode = array[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            mode = array[array.length - 1];
        }
        return mode;
    }


    /**
     * Test for {@link ArrayModeInPlace#modeArrayInPlace(int[])}.
     */
//    @Test
//    void testModeArray() {
//        assertEquals(2, ArrayModeInPlace.modeArrayInPlace(new int[]{1, 2, 3, 2, 4, 2, 2}));
//        assertEquals(-8, ArrayModeInPlace.modeArrayInPlace(new int[]{-43, -8, -8, -10, -8, -6}));
//        assertEquals(0, ArrayModeInPlace.modeArrayInPlace(new int[]{-4, 0, -2, -1, 0}));
//        assertEquals(1, ArrayModeInPlace.modeArrayInPlace(new int[]{1, 1, 1, 1, 1, 1}));
//    }

}
