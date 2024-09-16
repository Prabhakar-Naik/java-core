package com.springboot.core.primenumbers;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println("Prime numbers in 1 to 100");
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");
        }
    }
}
