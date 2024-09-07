package com.springboot.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author prabhakar, @Date 12-08-2024
 */
public class OptimalPartitionOfStrings {

    /*
Input: s = "abacaba"
Output: 4
Explanation:
Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
It can be shown that 4 is the minimum number of substrings needed.
Example 2:

Input: s = "ssssss"
Output: 6
Explanation:
The only valid partition is ("s","s","s","s","s","s").
    */

    public int partitionString(String s) {
        int count = 0;
        Set<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                count++;
                seen.clear();
            }
            seen.add(c);
        }

        return count + 1;
    }

    public static void main(String[] args) {
        OptimalPartitionOfStrings obj = new OptimalPartitionOfStrings();
        String  s = "abacaba";

        System.out.println("This is Concise Code:" +
                "\n"+obj.partitionString(s));
        System.out.println("This is Low Level Code:" +
                "\n"+partitionString1(s));
        s = "ssssss";
        System.out.println("This is Concise Code:" +
                "\n"+obj.partitionString(s));
        System.out.println("This is Low Level Code:" +
                "\n"+partitionString1(s));

    }

    public static int partitionString1(String s) {
        int count = 0, used = 0;

        for (char c : s.toCharArray()) {
            int mask = 1 << (c - 'a');
            if ((used & mask) != 0) {
                count++;
                used = 0;
            }
            used |= mask;
        }

        return count + 1;
    }
}
