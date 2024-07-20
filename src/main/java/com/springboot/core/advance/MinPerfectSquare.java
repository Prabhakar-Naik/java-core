package com.springboot.core.advance;

/**
 * @author prabhakar, @Date 12-07-2024
 */
public class MinPerfectSquare {
    public static void main(String[] args) {
        int num = 25; // Replace with your desired number
        System.out.println("Minimum perfect squares for " + num + ": " + getMinSquares(num));
    }

    public static int getMinSquares(int n) {
        if (n <= 3) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = i; // Initialize with the maximum possible value

            for (int x = 1; x <= Math.ceil(Math.sqrt(i)); x++) {
                int temp = x * x;
                if (temp > i) {
                    break;
                } else {
                    dp[i] = Math.min(dp[i], 1 + dp[i - temp]);
                }
            }
        }

        return dp[n];
    }
}
