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

        }
        return null;
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cstart, int cend) {
        return null;
    }

}
