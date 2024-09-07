package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 24-08-2024
 */
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        // Define the values for Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int value = romanValues.get(s.charAt(i));
            // Check if the next character is larger
            if (i + 1 < length && value < romanValues.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();

        // Test cases
        System.out.println(solution.romanToInt("III"));     // Output: 3
        System.out.println(solution.romanToInt("LVIII"));   // Output: 58
        System.out.println(solution.romanToInt("MCMXCIV")); // Output: 1994
    }
}
