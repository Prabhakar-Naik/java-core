package com.springboot.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author prabhakar, @Date 03-07-2025
 */

public class HigherOrderFunctionExample {

    // This concept comes from functional programming and is supported in Java
    // (since Java 8) using lambdas, functional interfaces, and method references.

    // To make code more reusable, flexible, and concise.

    // Often used in: 1. Callback mechanisms, 2. Event handling, 3. Functional operations like map, filter, reduce

    // Higher-order function
    static int operate(int x, Function<Integer, Integer> func) {
        return func.apply(x);  // Applies the function to x
    }

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> condition) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (condition.test(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = operate(5, n -> n * n);  // Passing a lambda
        System.out.println(result); // Output: 25

        result = operate(6, n -> n + n);
        System.out.println(result); // Output: 12


        List<Integer> numbers = Arrays.asList(1, 4, 6, 9, 12);
        // List<Integer> numbers = List.of(1, 4, 6, 9, 12);
        List<Integer> evens = filter(numbers, n -> n % 2 == 0);  // HOF usage
        System.out.println(evens); // Output: [4, 6, 12]
    }
}
