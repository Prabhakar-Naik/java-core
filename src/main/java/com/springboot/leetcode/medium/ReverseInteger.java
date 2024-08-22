package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 22-08-2024
 */
public class ReverseInteger {

    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before multiplying
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Return 0 if the number overflows
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Return 0 if the number underflows
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        int x1 = 123;
        System.out.println("Example 1 Output: " + solution.reverse(x1)); // 321

        int x2 = -123;
        System.out.println("Example 2 Output: " + solution.reverse(x2)); // -321

        int x3 = 120;
        System.out.println("Example 3 Output: " + solution.reverse(x3)); // 21
    }
}

