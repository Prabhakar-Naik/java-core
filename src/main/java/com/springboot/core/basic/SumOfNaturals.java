package com.springboot.core.basic;

/**
 * @author prabhakar, @Date 19-12-2024
 */
public class SumOfNaturals {

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(5));
    }

    public static int sumOfNaturalNumbers(int n){
        if (n == 1)
            return 1;
        return n + sumOfNaturalNumbers(n - 1);
    }
}
