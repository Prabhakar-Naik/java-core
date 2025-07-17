package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class SquareRoot {

    /**
     * Returns square root of a number.
     *
     * @param num To find SquareRoot
     * @param p   precision till how many decimal numbers we want accurate ans
     */
    public static double sqrt(int num, int p) {
        int start = 0;
        int end = num;
        double root = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((mid * mid) > num) {
                end = mid - 1;
            } else if ((mid * mid) < num) {
                start = mid + 1;
            }else {
                return mid;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root < num) {
                root = root + incr;
            }
            root = root - incr;
            incr = incr / 10;
        }
        return root;
    }


    /**
     * Test for {@link SquareRoot #SquareRoot(int,int)}.
     */
//    @Test
//    void test_sqrt() {
//        assertEquals(6.0, SquareRoot.sqrt(36, 1));
//        assertEquals(6.324555319999993, SquareRoot.sqrt(40, 9));
//        assertEquals(6.707999999999995, SquareRoot.sqrt(45, 3));
//        assertEquals(9.529999999999982, SquareRoot.sqrt(91, 2));
//    }

}
