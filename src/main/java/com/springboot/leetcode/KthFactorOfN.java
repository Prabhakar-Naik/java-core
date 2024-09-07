package com.springboot.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author prabhakar, @Date 12-08-2024
 */
public class KthFactorOfN {
    public static int kthFactor(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int kthFactor1(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        Collections.sort(factors);
        return factors.size() >= k ? factors.get(k - 1) : -1;
    }


    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
        System.out.println(kthFactor(7, 2));
        System.out.println(kthFactor(4, 4));

        System.out.println("Concise Code: ");
        System.out.println(kthFactor1(12, 3));
        System.out.println(kthFactor1(7, 2));
        System.out.println(kthFactor1(4, 4));

        System.out.println(Math.sqrt(12));
    }
}
