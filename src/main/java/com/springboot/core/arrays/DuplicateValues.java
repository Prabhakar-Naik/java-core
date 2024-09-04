package com.springboot.core.arrays;

/**
 * @author prabhakar, @Date 27-08-2024
 */
public class DuplicateValues {
    public static void main(String[] args) {
        int[] input = {10, 30, 25, 10, 40, 20, 10, 20, 10};

        // Iterate over the array
        for (int i = 0; i < input.length; i++) {
            boolean isDuplicate = false;
            int count = 0;

            // Check for duplicates in the array
            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                }
                // Mark as duplicate after first occurrence
                if (count > 1 && j != i) {
                    isDuplicate = true;
                }
            }

            // Print duplicate value (excluding original)
            if (isDuplicate) {
                // Check if this duplicate has already been printed
                for (int k = 0; k < i; k++) {
                    if (input[i] == input[k]) {
                        isDuplicate = false;
                        break;
                    }
                }
                if (isDuplicate) {
                    for (int l = 0; l < count - 1; l++) {
                        System.out.print(input[i] + " ");
                    }
                }
            }
        }
    }

}
