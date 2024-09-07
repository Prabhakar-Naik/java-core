package com.springboot.leetcode.easy;

import java.util.*;
/**
 * @author prabhakar, @Date 24-08-2024
 */

public class ClosestPalindrome {

    public String nearestPalindromic(String n) {
        int length = n.length();
        Set<Long> candidates = new HashSet<>();

        // Edge case for the smallest palindrome by mirroring
        long prefix = Long.parseLong(n.substring(0, (length + 1) / 2));

        // Add the closest palindromes by mirroring the prefix
        candidates.add(createPalindrome(prefix, length % 2 == 0));
        candidates.add(createPalindrome(prefix - 1, length % 2 == 0));
        candidates.add(createPalindrome(prefix + 1, length % 2 == 0));

        // Edge cases like 1000 -> 999 or 999 -> 1001
        candidates.add((long) Math.pow(10, length - 1) - 1);
        candidates.add((long) Math.pow(10, length) + 1);

        long num = Long.parseLong(n);
        candidates.remove(num);  // Remove the number itself if it is a palindrome

        long closest = -1;
        for (Long candidate : candidates) {
            if (closest == -1 || Math.abs(candidate - num) < Math.abs(closest - num) ||
                    (Math.abs(candidate - num) == Math.abs(closest - num) && candidate < closest)) {
                closest = candidate;
            }
        }

        return String.valueOf(closest);
    }

    private long createPalindrome(long prefix, boolean evenLength) {
        String strPrefix = String.valueOf(prefix);
        String palindrome = strPrefix + new StringBuilder(strPrefix.substring(0, evenLength ? strPrefix.length() : strPrefix.length() - 1)).reverse().toString();
        return Long.parseLong(palindrome);
    }

    public static void main(String[] args) {
        ClosestPalindrome cp = new ClosestPalindrome();

        // Test cases
        System.out.println(cp.nearestPalindromic("123")); // Output: "121"
        System.out.println(cp.nearestPalindromic("1"));   // Output: "0"
    }
}
