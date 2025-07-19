package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 18-07-2025
 */

public class BubbleSort {

    /**
     * Sort an array with bubbleSort algorithm.
     *
     * @param arr array to sort
     */
    public static void bubbleSort(int[] arr) {
        var lastIndex = arr.length - 1;

        for (var j = 0; j < lastIndex; j++) {
            for (var i = 0; i < lastIndex - j; i++) {
                var temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }


    /**
     * Tests for {@link BubbleSort#bubbleSort(int[])}.
     */
//    @Test
//    void testBubbleSort() {
//        var arr = new int[] {6, 3, 1, 5, 4, 2};
//        BubbleSort.bubbleSort(arr);
//        assertEquals(6, arr.length);
//        assertEquals(1, arr[0]);
//        assertEquals(2, arr[1]);
//        assertEquals(3, arr[2]);
//        assertEquals(4, arr[3]);
//        assertEquals(5, arr[4]);
//        assertEquals(6, arr[5]);
//    }

}
