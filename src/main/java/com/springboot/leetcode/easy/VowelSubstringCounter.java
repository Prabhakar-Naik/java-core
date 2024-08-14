package com.springboot.leetcode.easy;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class VowelSubstringCounter {

    public static void main(String[] args) {
        String word1 = "aeiouu";
        System.out.println("Number of vowel substrings: " + countVowelSubstrings(word1)); // Output: 2

        String word2 = "unicornarihan";
        System.out.println("Number of vowel substrings: " + countVowelSubstrings(word2)); // Output: 0
    }

    public static int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            int[] vowels = new int[5]; // a, e, i, o, u
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                if (c == 'a') vowels[0]++;
                else if (c == 'e') vowels[1]++;
                else if (c == 'i') vowels[2]++;
                else if (c == 'o') vowels[3]++;
                else if (c == 'u') vowels[4]++;
                else break; // Stop if a non-vowel is encountered

                if (allVowelsPresent(vowels)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean allVowelsPresent(int[] vowels) {
        for (int v : vowels) {
            if (v == 0) return false;
        }
        return true;
    }

}
