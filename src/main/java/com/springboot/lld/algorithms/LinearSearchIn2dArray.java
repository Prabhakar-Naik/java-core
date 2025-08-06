package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 19-07-2025
 */

public class LinearSearchIn2dArray {

    /**
     * Search an item with linearSearch algorithm.
     *
     * @param arr    array to search
     * @param target an item to search
     * @return if location of target is found,otherwise return {-1,-1}
     */

    public static int[] linearSearchIn2dArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    /**
     * Test for {@link LinearSearchIn2dArray #LinearSearchIn2dArraySnippet(int[][],int)}.
     */
//    @Test
//    void testLinearSearchIn2dArraySnippetTest() {
//        int[][] arr1 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
//        int[] ans1 = {1, 2};
//        Assertions assertions  = null;
//        Assertions.assertArrayEquals(ans1, LinearSearchIn2dArray.linearSearch2dArray(arr1, 26));
//        int[][] arr2 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
//        int[] ans2 = {-1, -1};
//        Assertions.assertArrayEquals(ans2, LinearSearchIn2dArray.linearSearch2dArray(arr2, 69));
//    }

}
