package com.springboot.core.concepts;

/**
 * @author prabhakar, @Date 16-06-2025
 */

public class FizzBuzz {

    public static void main(String[] args) {

        int number = 15;

        for(int i=1; i<=number; i++){
            if(i%15==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }

    }
}
