package com.springboot.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class LongestVowelSubstring {
    public static void main(String[] args) {
        LongestVowelSubstring obj = new LongestVowelSubstring();
        String word1 = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        System.out.println("Longest beautiful substring length: " + obj.longestBeautifulSubstring(word1)); // Output: 13

        String word2 = "aeeeiiiioooauuuaeiou";
        System.out.println("Longest beautiful substring length: " + obj.longestBeautifulSubstring(word2)); // Output: 5

        String word3 = "a";
        System.out.println("Longest beautiful substring length: " + obj.longestBeautifulSubstring(word3)); // Output: 0
    }

    public int longestBeautifulSubstring(String word) {
        int n = word.length();
        List<Node> arr = new ArrayList<>();
        for (int i = 0; i < n;) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                ++j;
            }
            arr.add(new Node(word.charAt(i), j - i));
            i = j;
        }
        int ans = 0;
        for (int i = 0; i < arr.size() - 4; ++i) {
            Node a = arr.get(i), b = arr.get(i + 1), c = arr.get(i + 2), d = arr.get(i + 3),
                    e = arr.get(i + 4);
            if (a.c == 'a' && b.c == 'e' && c.c == 'i' && d.c == 'o' && e.c == 'u') {
                ans = Math.max(ans, a.v + b.v + c.v + d.v + e.v);
            }
        }
        return ans;
    }

    class Node {
        char c;
        int v;

        Node(char c, int v) {
            this.c = c;
            this.v = v;
        }
    }

}