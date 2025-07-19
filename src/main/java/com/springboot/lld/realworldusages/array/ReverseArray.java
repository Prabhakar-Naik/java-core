package com.springboot.lld.realworldusages.array;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class ReverseArray {

    /**
     * The function then reverses the elements of the array between the starting and ending
     * indices using a while loop and a temporary variable `temp`. Finally, the function returns
     * the reversed array.
     *
     * @param array a array
     * @param start start index array
     * @param end end index array
     * @return reverses elements in the array
     * @throws IllegalArgumentException if the [start] index is greater
     *         than the [end] index or if the array is null
     **/

    public static <T> T[] reverseArray(T[] array, int start, int end) {
        if (start > end || array == null)
            throw new IllegalArgumentException("Invalid Arguments");

        int minimumSizeArrayForReversal = 2;
        if (start == end || array.length < minimumSizeArrayForReversal)
            return array;

        while (start < end) {
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }



    /** reverseArray should correctly reverse the entire array. **/

//    @Test
//    void testReverseArrayFull() {
//        Integer[] arr = {1, 2, 3, 4, 5};
//        Integer[] result = ReverseArray.reverseArray(arr, 0, arr.length - 1);
//        Integer[] expected = {5, 4, 3, 2, 1};
//        assertArrayEquals(expected, result);
//    }
//
//    /** reverseArray should correctly reverse a subset of the array. **/
//
//    @Test
//    void testReverseArrayPartial() {
//        String[] arr = {"Ali", "Shabnam", "Reza", "Fatemeh"};
//        String[] result = ReverseArray.reverseArray(arr, 1, 2);
//        String[] expected = {"Ali", "Reza", "Shabnam", "Fatemeh"};
//        assertArrayEquals(expected, result);
//    }
//
//    /** reverseArray should correctly reverse a subset of the array with decimal values. **/
//
//    @Test
//    void testReverseArrayDecimal() {
//        Double[] arr = {5.5, 4.4, 3.3, 2.2, 1.1};
//        Double[] result = ReverseArray.reverseArray(arr, 2, 4);
//        Double[] expected = {5.5, 4.4, 1.1, 2.2, 3.3};
//        assertArrayEquals(expected, result);
//    }
//
//    /** reverseArray should correctly handle a single element array. **/
//
//    @Test
//    void testReverseArraySingleElement() {
//        Integer[] arr = {1};
//        Integer[] result = ReverseArray.reverseArray(arr, 0, arr.length - 1);
//        Integer[] expected = {1};
//        assertArrayEquals(expected, result);
//    }
//
//    /** reverseArray should correctly handle an empty array. **/
//
//    @Test
//    void testReverseArrayEmpty() {
//        Integer[] arr = new Integer[0];
//        Integer[] result = ReverseArray.reverseArray(arr, 0, 0);
//        Integer[] expected = new Integer[0];
//        assertArrayEquals(expected, result);
//    }
//
//    /** reverseArray when start and end are equal. **/
//
//    @Test
//    void testReverseArrayNoChange() {
//        Integer[] array = {1, 2, 3, 4, 5};
//        int start = 2;
//        int end = 2;
//        Integer[] reversedArray = ReverseArray.reverseArray(array, start, end);
//        assertArrayEquals(array, reversedArray);
//    }
//
//    /** reverseArray should throw ArrayIndexOutOfBoundsException if startIndex is less than 0. **/
//
//    @Test
//    void testReverseArrayNegativeStartIndex() {
//        Integer[] arr = {1, 2, 3, 4, 5};
//        assertThrows(ArrayIndexOutOfBoundsException.class, () ->
//                ReverseArray.reverseArray(arr, -1, 3));
//    }
//
//    /** reverseArray should throw ArrayIndexOutOfBoundsException if endIndex
//     *  is greater than the array size minus 1. **/
//
//    @Test
//    void testReverseArrayEndIndexOutOfBounds() {
//        Integer[] arr = {1, 2, 3, 4, 5};
//        assertThrows(ArrayIndexOutOfBoundsException.class,
//                () -> ReverseArray.reverseArray(arr, 2, 5));
//    }
//
//    /** reverseArray should throw ArrayIndexOutOfBoundsException
//     * if startIndex is greater than endIndex. **/
//
//    @Test
//    void testReverseArrayInvalidIndexes() {
//        Integer[] arr = {1, 2, 3, 4, 5};
//        assertThrows(IllegalArgumentException.class, () -> ReverseArray.reverseArray(arr, 3, 2));
//    }
//
//    /** reverseArray should throw IllegalArgumentException if the input array is null. */
//
//    @Test
//    void  testReverseArrayNullInput() {
//        assertThrows(IllegalArgumentException.class, () ->
//                ReverseArray.reverseArray(null, 0, 2));
//    }

}
