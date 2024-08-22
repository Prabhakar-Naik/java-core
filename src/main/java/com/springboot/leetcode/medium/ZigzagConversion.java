package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 22-08-2024
 */
public class ZigzagConversion {

    public String convert(String s, int numRows) {
        // Edge case: if numRows is 1, return the string as is
        if (numRows == 1) return s;

        // Initialize a StringBuilder array to hold the strings for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Traverse the string and append characters to the appropriate row
        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction at the first and last row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single result string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion zigzag = new ZigzagConversion();

        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Example 1 Output: " + zigzag.convert(s1, numRows1)); // PAHNAPLSIIGYIR

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Example 2 Output: " + zigzag.convert(s2, numRows2)); // PINALSIGYAHRPI

        String s3 = "A";
        int numRows3 = 1;
        System.out.println("Example 3 Output: " + zigzag.convert(s3, numRows3)); // A
    }
}

