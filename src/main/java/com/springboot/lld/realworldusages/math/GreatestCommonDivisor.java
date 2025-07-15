package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 14-07-2025
 */

public class GreatestCommonDivisor {

    /**
     * Greatest common divisor calculation.
     *
     * @param a one of the numbers whose gcd is to be computed
     * @param b other number whose gcd is to be computed
     * @return gcd of the two numbers
     */
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return greatestCommonDivisor(b, a % b);
    }

    /**
     * Tests for {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)}.
     */
//    @Test
//    void testGcd() {
//        assertEquals(2, GreatestCommonDivisor.greatestCommonDivisor(2, 4));
//        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(2, 5));
//        assertEquals(6, GreatestCommonDivisor.greatestCommonDivisor(18, 24));
//        assertEquals(7, GreatestCommonDivisor.greatestCommonDivisor(7, 7));
//    }
}
