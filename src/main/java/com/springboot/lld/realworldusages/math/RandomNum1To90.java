package com.springboot.lld.realworldusages.math;

import java.util.Random;

/**
 * @author prabhakar, @Date 26-08-2025
 */

public class RandomNum1To90 {

    public static void main(String[] args) {

        Random rnd = new Random(); // or new Random(seed) for reproducible results
        int k = 90;                // how many unique numbers you want (1..90). set k=90 for all
        if (k < 1 || k > 90) throw new IllegalArgumentException("k must be 1..90");

        int[] a = new int[90];
        for (int i = 0; i < 90; i++) a[i] = i + 1;

        // Partial Fisher-Yates using nextDouble() only
        for (int i = 0; i < k; i++) {
            int range = 90 - i; // number of choices remaining
            int offset = (int) (rnd.nextDouble() * range); // 0 .. range-1
            int j = i + offset;                             // i .. 89
            // swap a[i] and a[j]
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            System.out.println(a[i]);
        }

    }
}
