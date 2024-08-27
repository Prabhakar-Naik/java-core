package com.springboot.core.arrays;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 24-08-2024
 */
public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] arr = { 10, 30, 25, 10, 40, 10, 60,40, 10 };
        int[] dup = new int[arr.length];
        int index =0 ;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            while (isUnique) {
                dup[index] = arr[i];
                index++;
                System.out.print(arr[i] + " ");
                isUnique = false;
            }
        }

        System.out.println(Arrays.toString(dup));

    }
}
