package com.springboot.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring1(String s) {
        int[] index = new int[128]; // Assuming ASCII characters
        int maxLength = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            start = Math.max(start, index[currentChar]);
            maxLength = Math.max(maxLength, end - start + 1);
            index[currentChar] = end + 1;
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String string = "abcabcbbcdy";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(string));
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring1(string));

    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(set);
        return maxLength;
    }

}
