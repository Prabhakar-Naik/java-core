package com.springboot.streams;

import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 24-06-2024
 */
public class NumberStream {

    public static void main(String[] args) {
        // lambda reference type
        System.out.println("Even numbers");
        IntStream.range(1,10).filter(x -> x % 2 ==0).forEach(System.out::println);

        // lambda core type
        System.out.println("Odd Numbers");
        IntStream.range(1,10).filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));

        // prime numbers range of 1 to 10
        System.out.println("prime numbers");
        IntStream.range(1,10).forEach(x -> {
            int count = 0;
            for (int i =2; i < x; i++) {
                if (x % i == 0)
                    count++;
            }
            if (count == 0)
                System.out.println(x);
        });




    }
}
