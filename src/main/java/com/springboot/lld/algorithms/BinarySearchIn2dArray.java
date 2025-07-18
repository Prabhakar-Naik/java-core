package com.springboot.lld.algorithms;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class BinarySearchIn2dArray {

    /**
     * Search an item with binarySearch algorithm.
     *
     * @param matrix should be sorted
     * @param target an item to search
     * @return if location of item is found, otherwise return {-1,-1}
     */

    public static int[] binarySearchIn2dArray(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;

        if (rows == 1)
            return binarySearch(matrix, target, 0, 0, cols);

        int rstart = 0;
        int rend = rows;
        int cmid = cols / 2;

        while (rstart <= rend - 1) {
            int rmid = rstart + (rend - rstart) / 2;
            if (matrix[rmid][cmid] > target)
                rend =rmid;
            else if(matrix[rmid][cmid] < target)
                rstart = rmid;
            else
                return new int[]{rmid, cmid};
        }

        if (matrix[rstart][cmid] == target)
            return new int[]{rstart, cmid};
        if (matrix[rend][cmid] == target)
            return new int[]{rend, cmid};
        if (target <= matrix[rstart][cmid - 1])
            return binarySearch(matrix, target, rstart, 0, cmid - 1);
        if (target >= matrix[rstart][cmid + 1])
            return binarySearch(matrix, target, rstart, cmid + 1, cols);
        if (target <= matrix[rend][cmid - 1])
            return binarySearch(matrix, target, rend, 0, cmid - 1);
        if (target <= matrix[rend][cmid + 1])
            return binarySearch(matrix, target, rend, cmid + 1, cols);

        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cstart, int cend) {
        while (cstart <= cend) {
            int cmid = cstart + (cend - cstart) / 2;
            if (matrix[row][cmid] > target)
                cend = cmid - 1;
            else if (matrix[row][cmid] < target)
                cstart = cend + 1;
            else
                return new int[]{row, cmid};
        }
        return new int[]{-1, -1};
    }



    /**
     * Test for {@link BinarySearchIn2dArray#binarySearchIn2dArray(int[][],int)}.
     */
//    @Test
//    void testBinarySearchIn2dArraySnippetTest() {
//        int[][] arr1 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
//        int[] ans1 = {1, 2};
//        Assertions assertions  = null;
//        Assertions.assertArrayEquals(ans1, BinarySearchIn2dArray.binarySearchIn2dArray(arr1, 26));
//        int[][] arr2 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
//        int[] ans2 = {-1, -1};
//        Assertions.assertArrayEquals(ans2, BinarySearchIn2dArray.binarySearchIn2dArray(arr2, 69));
//    }

}
