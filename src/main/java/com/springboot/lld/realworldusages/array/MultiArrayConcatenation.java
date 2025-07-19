package com.springboot.lld.realworldusages.array;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class MultiArrayConcatenation {

    /**
     * Generic N array concatenation Credits: Joachim Sauer https://stackoverflow.com/questions/80476/how-can-i-concatenate-two-arrays-in-java.
     *
     * @param first is the first array (not null)
     * @param rest  the rest of the arrays (optional)
     * @param <T>   the element type
     * @return concatenated array
     */

    @SafeVarargs
    public static <T> T[] multiArrayConcat(T[] first, T[]...rest){
        var totalLength = first.length;
        for (var array : rest) {
            totalLength += array.length;
        }

        var result = Arrays.copyOf(first, totalLength);
        var offset = first.length;
        for (var array : rest) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }


    /**
     * Tests for {@link MultiArrayConcatenation#multiArrayConcat(Object[], Object[][])}.
     */
//    @Test
//    void testnArrayConcat() {
//        var single = MultiArrayConcatenation.multiArrayConcat(new Integer[1]);
//        assertEquals(single.length, 1);
//        var multiple
//                = MultiArrayConcatenation.multiArrayConcat(new String[5],
//                new String[12],
//                new String[3],
//                new String[8]);
//        assertEquals(multiple.length, 28);
//        assertThrows(NullPointerException.class, () -> MultiArrayConcatenation
//                .multiArrayConcat(null, null, null, null));
//    }


}
