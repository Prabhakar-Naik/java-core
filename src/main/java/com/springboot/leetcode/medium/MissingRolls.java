package com.springboot.leetcode.medium;

import java.util.Arrays;
/**
 * @author prabhakar, @Date 05-09-2024
 */
public class MissingRolls {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSum = (n + m) * mean;
        int existingSum = Arrays.stream(rolls).sum();
        int missingSum = totalSum - existingSum;

        // Check if the missing sum is possible
        if (missingSum < n || missingSum > n * 6) {
            return new int[0];
        }

        // Calculate the average of the missing rolls
        int missingMean = missingSum / n;
        int remainder = missingSum % n;

        // Create the array of missing rolls
        int[] missingRolls = new int[n];
        Arrays.fill(missingRolls, missingMean);
        for (int i = 0; i < remainder; i++) {
            missingRolls[i]++;
        }

        return missingRolls;
    }

    public static void main(String[] args) {
        int[] rolls1 = {3, 2, 4, 3};
        int mean1 = 4;
        int n1 = 2;
        int[] missingRolls1 = new MissingRolls().missingRolls(rolls1, mean1, n1);
        System.out.println(Arrays.toString(missingRolls1)); // Output: [6, 6]

        int[] rolls2 = {1, 5, 6};
        int mean2 = 3;
        int n2 = 4;
        int[] missingRolls2 = new MissingRolls().missingRolls(rolls2, mean2, n2);
        System.out.println(Arrays.toString(missingRolls2)); // Output: [2, 3, 2, 2]
    }
}
