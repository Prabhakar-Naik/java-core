package com.springboot.leetcode.hard;

/**
 * @author prabhakar, @Date 12-08-2024
 */
public class RegularExpressionMatch {

    /*
Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
    */

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] ||
                            (i > 0 && (s.charAt(i - 1) == p.charAt(j - 2) ||
                                    p.charAt(j - 2) == '.') && dp[i - 1][j]);
                } else {
                    dp[i][j] = i > 0 && dp[i - 1][j - 1] &&
                            (s.charAt(i - 1) == p.charAt(j - 1) ||
                                    p.charAt(j - 1) == '.');
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {

    }
}
