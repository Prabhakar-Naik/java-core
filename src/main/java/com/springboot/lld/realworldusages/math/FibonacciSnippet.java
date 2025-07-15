package com.springboot.lld.realworldusages.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 14-07-2025
 */

public class FibonacciSnippet {

    /**
     * Recursive Fibonacci series. Works only for small n and is spectacularly inefficient
     *
     * @param n given number
     * @return fibonacci number for given n
     */
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }


    /**
     * Fibonacci series using dynamic programming. Works for larger ns as well.
     *
     * @param n given number
     * @return fibonacci number for given n
     */
    public static int fibonacciBig(int n) {
        int previous = 0;
        int current = 1;

        for (int i = 0; i < n; i++) {
            int temp = previous + current;
            previous = current;
            current = temp;
        }
        return current;
    }

    /**
     * Example of what an iterative implementation of Fibonacci looks like.
     *
     * @param number given number
     * @return fibonacci number for given n
     */
    public static int iterativeFibonacci(int number) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i < number+1; i++) {
            list.add(list.get(i - 2) + list.get(i - 1));
        }
        return list.get(number);
    }


    /**
     * Tests for {@link FibonacciSnippet#fibonacci(int)}.
     */
//    @Test
//    void testFibonacci() {
//        assertEquals(0, FibonacciSnippet.fibonacci(0));
//        assertEquals(1, FibonacciSnippet.fibonacci(1));
//        assertEquals(1, FibonacciSnippet.fibonacci(2));
//        assertEquals(2, FibonacciSnippet.fibonacci(3));
//        assertEquals(3, FibonacciSnippet.fibonacci(4));
//        assertEquals(5, FibonacciSnippet.fibonacci(5));
//        assertEquals(8, FibonacciSnippet.fibonacci(6));
//        assertEquals(13, FibonacciSnippet.fibonacci(7));
//        assertEquals(21, FibonacciSnippet.fibonacci(8));
//        assertEquals(34, FibonacciSnippet.fibonacci(9));
//        assertEquals(55, FibonacciSnippet.fibonacci(10));
//    }


//    /**
//     * Tests for {@link FibonacciSnippet#fibonacciBig(int)}.
//     */
//    @Test
//    void testFibonacciBig() {
//        assertEquals(0, FibonacciSnippet.fibonacci(0));
//        assertEquals(1, FibonacciSnippet.fibonacci(1));
//        assertEquals(1, FibonacciSnippet.fibonacci(2));
//        assertEquals(2, FibonacciSnippet.fibonacci(3));
//        assertEquals(3, FibonacciSnippet.fibonacci(4));
//        assertEquals(5, FibonacciSnippet.fibonacci(5));
//        assertEquals(8, FibonacciSnippet.fibonacci(6));
//        assertEquals(13, FibonacciSnippet.fibonacci(7));
//        assertEquals(21, FibonacciSnippet.fibonacci(8));
//        assertEquals(34, FibonacciSnippet.fibonacci(9));
//        assertEquals(55, FibonacciSnippet.fibonacci(10));
//        assertEquals(6765, FibonacciSnippet.fibonacci(20));
//        assertEquals(102334155, FibonacciSnippet.fibonacci(40));
//    }


//    /**
//     * Tests for {@link FibonacciSnippet#iterativeFibonacci(int)}.
//     */
//    @Test
//    void testIterativeFibonacci() {
//        assertEquals(0, FibonacciSnippet.iterativeFibonacci(0));
//        assertEquals(1, FibonacciSnippet.iterativeFibonacci(1));
//        assertEquals(1, FibonacciSnippet.iterativeFibonacci(2));
//        assertEquals(2, FibonacciSnippet.iterativeFibonacci(3));
//        assertEquals(3, FibonacciSnippet.iterativeFibonacci(4));
//        assertEquals(5, FibonacciSnippet.iterativeFibonacci(5));
//        assertEquals(8, FibonacciSnippet.iterativeFibonacci(6));
//        assertEquals(13, FibonacciSnippet.iterativeFibonacci(7));
//        assertEquals(21, FibonacciSnippet.iterativeFibonacci(8));
//        assertEquals(34, FibonacciSnippet.iterativeFibonacci(9));
//        assertEquals(55, FibonacciSnippet.iterativeFibonacci(10));
//    }

}
