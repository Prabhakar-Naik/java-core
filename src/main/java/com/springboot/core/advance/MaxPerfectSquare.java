package com.springboot.core.advance;

/**
 * @author prabhakar, @Date 12-07-2024
 */
public class MaxPerfectSquare {

    public static void main(String[] args) {

        int num =25;
        int count = 0;

        for (int x = 1; x * x < num; x++) {
            System.out.println(x);
            count++;
        }

        System.out.println("Maximum perfect squares for " + num + ": " + count);

    }
}
