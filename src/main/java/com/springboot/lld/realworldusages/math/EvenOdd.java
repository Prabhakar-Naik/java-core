package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 14-07-2025
 */

public class EvenOdd {

    /**
     * Returns string denoting number is odd or even.
     *
     * @param num To check whether its even or odd
     * @return string denoting its even or odd
     */
    public static String evenOdd(int num){
        if (num % 2 == 0)
            return "even";
        else return "odd";
    }

    /**
     * Test for {@link EvenOdd #EvenOdd(int)}.
     */
//    @Test
//    void test_evenOdd() {
//        assertEquals("even", EvenOdd.evenOdd(4));
//        assertEquals("even", EvenOdd.evenOdd(0));
//        assertEquals("odd", EvenOdd.evenOdd(97));
//        assertEquals("even", EvenOdd.evenOdd(-96662));
//        assertEquals("odd", EvenOdd.evenOdd(1));
//    }
}
