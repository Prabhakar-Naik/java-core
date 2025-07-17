package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class ArrayConcat {

    /**
     * Generic 2 array concatenation Credits: Joachim Sauer https://stackoverflow.com/questions/80476/how-can-i-concatenate-two-arrays-in-java.
     *
     * @param first  is the first array (not null)
     * @param second is the second array (not null)
     * @param <T>    the element type
     * @return concatenated array
     */

    public static <T> T[] arrayConcat(T[] first, T[] second) {
        var result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }


    /**
     * Tests for {@link ArrayConcat#arrayConcat(Object[], Object[])}.
     */
//    @Test
//    void testArrayConcat() {
//        var integers = ArrayConcat.arrayConcat(new Integer[5], new Integer[5]);
//        assertEquals(integers.length, 10);
//        var strings = ArrayConcat.arrayConcat(new String[0], new String[0]);
//        assertEquals(strings.length, 0);
//        assertThrows(NullPointerException.class, () -> ArrayConcat.arrayConcat(null, null));
//    }


}
