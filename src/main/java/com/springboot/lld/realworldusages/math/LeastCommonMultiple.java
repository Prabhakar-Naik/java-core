package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 14-07-2025
 */

public class LeastCommonMultiple {

    /**
     * Least common multiple  calculation.
     *
     * @param a one of the numbers whose lcm is to be computed
     * @param b other number whose lcm is to be computed
     * @return lcm of the two numbers
     */
    public static int leastCommonMultiple(int a, int b) {
        int max = a > b ? a : b; // Math.max(a, b);
        int min = a < b ? a : b; // Math.min(a, b);

        for (int i = 1; i <= min; i +=1){
            int product = max * i;
            if (product % min == 0)
                return product;
        }
        return max * min;
    }


    /**
     * Tests for {@link LeastCommonMultiple#leastCommonMultiple(int, int)}.
     */
//    @Test
//    void testLcm() {
//        assertEquals(4, LeastCommonMultiple.leastCommonMultiple(2, 4));
//        assertEquals(10, LeastCommonMultiple.leastCommonMultiple(2, 5));
//        assertEquals(72, LeastCommonMultiple.leastCommonMultiple(18, 24));
//        assertEquals(7, LeastCommonMultiple.leastCommonMultiple(7, 7));
//    }
}
