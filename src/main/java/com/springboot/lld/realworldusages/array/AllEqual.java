package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class AllEqual {

    /**
     * Returns true if all elements in array are equal.
     *
     * @param arr the array to check (not null)
     * @param <T> the element type
     * @return true if all elements in the array are equal
     */

    public static <T> boolean allEqual(T[] arr) {
        return Arrays.stream(arr).distinct().count() == 1;
    }

    /**
     * Tests for {@link AllEqual#allEqual(Object[])}.
     */
//    @Test
//    void testAllEqual() {
//        var intArray = new Integer[5];
//        assertTrue(AllEqual.allEqual(intArray));
//        intArray[0] = 1;
//        assertFalse(AllEqual.allEqual(intArray));
//        var stringArray = new String[10];
//        Arrays.fill(stringArray, "Hello World");
//        assertTrue(AllEqual.allEqual(stringArray));
//        stringArray[3] = "Bye World";
//        assertFalse(AllEqual.allEqual(stringArray));
//        var doubleArray = new Double[1];
//        assertTrue(AllEqual.allEqual(doubleArray));
//        assertThrows(NullPointerException.class, () -> AllEqual.allEqual(null));
//    }

}
