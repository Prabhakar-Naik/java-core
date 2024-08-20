package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 20-08-2024
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);   // Even length palindromes
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        // Test cases
        System.out.println(lps.longestPalindrome("babad"));  // Output: "bab" or "aba"
        System.out.println(lps.longestPalindrome("cbbd"));   // Output: "bb"

    }
}
