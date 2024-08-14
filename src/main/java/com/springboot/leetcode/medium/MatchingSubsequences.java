package com.springboot.leetcode.medium;

import java.util.*;
/**
 * @author prabhakar, @Date 14-08-2024
 */
public class MatchingSubsequences {
    public static void main(String[] args) {
        String s1 = "abcde";
        String[] words1 = {"a", "bb", "acd", "ace"};
        System.out.println("Number of matching subsequences: " + numMatchingSubseq(s1, words1)); // Output: 3

        String s2 = "dsahjpjauf";
        String[] words2 = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
        System.out.println("Number of matching subsequences: " + numMatchingSubseq(s2, words2)); // Output: 2
    }

    public static int numMatchingSubseq(String s, String[] words) {
        Map<Character, List<Integer>> charPositions = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charPositions.computeIfAbsent(s.charAt(i), k -> new ArrayList<>()).add(i);
        }

        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, charPositions)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSubsequence(String word, Map<Character, List<Integer>> charPositions) {
        int prevIndex = -1;
        for (char c : word.toCharArray()) {
            if (!charPositions.containsKey(c)) {
                return false;
            }
            List<Integer> positions = charPositions.get(c);
            int nextIndex = findNextIndex(positions, prevIndex);
            if (nextIndex == -1) {
                return false;
            }
            prevIndex = nextIndex;
        }
        return true;
    }

    private static int findNextIndex(List<Integer> positions, int prevIndex) {
        int left = 0, right = positions.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (positions.get(mid) > prevIndex) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left < positions.size() ? positions.get(left) : -1;
    }
}

