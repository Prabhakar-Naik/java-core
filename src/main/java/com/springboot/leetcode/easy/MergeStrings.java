package com.springboot.leetcode.easy;

/**
 * @author prabhakar, @Date 20-08-2024
 */
public class MergeStrings {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Merge characters while both words have characters remaining
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining characters from word1, if any
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        // Append remaining characters from word2, if any
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        MergeStrings ms = new MergeStrings();

        // Test cases
        System.out.println(ms.mergeAlternately("abc", "pqr"));   // Output: "apbqcr"
        System.out.println(ms.mergeAlternately("ab", "pqrs"));   // Output: "apbqrs"
        System.out.println(ms.mergeAlternately("abcd", "pq"));   // Output: "apbqcd"
    }
}
