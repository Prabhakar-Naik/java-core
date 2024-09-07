package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 24-08-2024
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        // Roman numeral values and corresponding symbols in descending order
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Iterate through each value-symbol pair
        for (int i = 0; i < values.length && num > 0; i++) {
            // Repeat while the current value can be subtracted from num
            while (num >= values[i]) {
                num -= values[i];        // Subtract the value from num
                roman.append(symbols[i]); // Append the symbol to the result
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman solution = new IntegerToRoman();

        // Test cases
        System.out.println(solution.intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(solution.intToRoman(58));   // Output: "LVIII"
        System.out.println(solution.intToRoman(1994)); // Output: "MCMXCIV"
    }
}

