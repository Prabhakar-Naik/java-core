package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 14-07-2025
 */

public class Factorial {

    /**
     * Factorial. Works only for small numbers
     *
     * @param number for which factorial is to be calculated for
     * @return factorial
     */
    public static int factorial(int number) {
        var result = 1;
        for (var factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    /**
     * Factorial. Example of what the recursive implementation looks like.
     *
     * @param number for which factorial is to be calculated for
     * @return factorial
     */

    public static int recursiveFactorial(int number) {
        var initial = 1;
        if (number == initial)
            return initial + 1;
        return number * recursiveFactorial(number - 1);
    }

    /**
     * Tests for {@link Factorial#factorial(int)}.
     */
//    @Test
//    void testFactorial() {
//        assertEquals(1, Factorial.factorial(0));
//        assertEquals(1, Factorial.factorial(1));
//        assertEquals(2, Factorial.factorial(2));
//        assertEquals(6, Factorial.factorial(3));
//        assertEquals(24, Factorial.factorial(4));
//        assertEquals(120, Factorial.factorial(5));
//        assertEquals(720, Factorial.factorial(6));
//        assertEquals(5040, Factorial.factorial(7));
//        assertEquals(40320, Factorial.factorial(8));
//        assertEquals(362880, Factorial.factorial(9));
//        assertEquals(3628800, Factorial.factorial(10));
//    }

    /**
     * Tests for {@link Factorial#recursiveFactorial(int)}.
     */
//    @Test
//    void testRecursiveFactorial() {
//        assertEquals(1, Factorial.recursiveFactorial(0));
//        assertEquals(1, Factorial.recursiveFactorial(1));
//        assertEquals(2, Factorial.recursiveFactorial(2));
//        assertEquals(6, Factorial.recursiveFactorial(3));
//        assertEquals(24, Factorial.recursiveFactorial(4));
//        assertEquals(120, Factorial.recursiveFactorial(5));
//        assertEquals(720, Factorial.recursiveFactorial(6));
//        assertEquals(5040, Factorial.recursiveFactorial(7));
//        assertEquals(40320, Factorial.recursiveFactorial(8));
//        assertEquals(362880, Factorial.recursiveFactorial(9));
//        assertEquals(3628800, Factorial.recursiveFactorial(10));
//    }
}
