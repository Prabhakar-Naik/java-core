package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 22-08-2024
 */
public class StringToIntegerAtos {

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check if the next character is a sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert the characters to an integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        StringToIntegerAtos atos = new StringToIntegerAtos();

        String s1 = "42";
        System.out.println("Input: \"" + s1 + "\", Output: " + atos.myAtoi(s1)); // 42

        String s2 = "   -42";
        System.out.println("Input: \"" + s2 + "\", Output: " + atos.myAtoi(s2)); // -42

        String s3 = "4193 with words";
        System.out.println("Input: \"" + s3 + "\", Output: " + atos.myAtoi(s3)); // 4193

        String s4 = "words and 987";
        System.out.println("Input: \"" + s4 + "\", Output: " + atos.myAtoi(s4)); // 0

        String s5 = "-91283472332";
        System.out.println("Input: \"" + s5 + "\", Output: " + atos.myAtoi(s5)); // -2147483648
    }
}

