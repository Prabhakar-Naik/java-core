package com.springboot.leetcode.easy;

/**
 * @author prabhakar, @Date 22-08-2024
 */
public class NumberComplement {

    public int findComplement(int num) {
        // Get the number of bits needed to represent 'num' without leading zeros.
        int bitLength = Integer.toBinaryString(num).length();

        // Create a bitmask where all bits are set to 1 (with the same length as num's binary representation).
        int bitmask = (1 << bitLength) - 1;

        // XOR num with the bitmask to get the complement.
        return num ^ bitmask;
    }

    public static void main(String[] args) {
        NumberComplement solution = new NumberComplement();

        int num1 = 5;
        System.out.println("Input: " + num1 + ", Output: " + solution.findComplement(num1)); // 2

        int num2 = 1;
        System.out.println("Input: " + num2 + ", Output: " + solution.findComplement(num2)); // 0
    }
}