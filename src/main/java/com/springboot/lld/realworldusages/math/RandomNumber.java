package com.springboot.lld.realworldusages.math;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class RandomNumber {

    private RandomNumber() {
    }

    private static Random random = new Random();

    /**
     * Return a random number between two given numbers.
     *
     * @param start Starting point to find the random number
     * @param end   Ending point to find the random number
     * @return Number denoting the random number generated
     */

    public static <T extends Number> Number getRandomNumber(T start, T end) {

        if (start instanceof Byte && end instanceof Byte) {
            return (start.byteValue()) + random.nextInt(end.byteValue() - start.byteValue() + 1);
        } else if (start instanceof Short && end instanceof Short) {
            return (start.shortValue()) + random.nextInt(end.intValue() - start.intValue() + 1);
        } else if (start instanceof Integer && end instanceof Integer) {
            return (start.intValue()) + random.nextInt(end.intValue() - start.intValue() + 1);
        } else if (start instanceof Long && end instanceof Long) {
            return (start.longValue()) + random.nextDouble() * (end.longValue() - start.longValue() + 1);
        } else if (start instanceof Float && end instanceof Float) {
            return start.floatValue() + random.nextFloat(end.floatValue() - start.floatValue());
        } else if (start instanceof Double && end instanceof Double) {
            return start.doubleValue() + random.nextDouble(end.doubleValue() - start.doubleValue());
        } else if (start instanceof BigInteger && end instanceof BigInteger) {
            return start.longValue() + random.nextLong() * (end.longValue() - start.longValue() + 1);
        } else {
            throw new IllegalArgumentException("Invalid Numbers As Arguments " + start.getClass() + " and " + end.getClass());
        }
    }


    /**
     * Tests for {@link RandomNumber#getRandomNumber(Number, Number)}.
     */

//    @RepeatedTest(100)
//    void testGetRandomNumber() {
//        // Test for Short range
//        Number shortResult = RandomNumber.getRandomNumber(
//                (short) 2, (short) 7);
//        assertTrue(shortResult instanceof Short);
//        assertTrue((shortResult.shortValue() >= 2) && (shortResult.shortValue() <= 7));
//        // Test for Integer range
//        Number intResult = RandomNumber.getRandomNumber(5, 10);
//        assertTrue(intResult instanceof Integer);
//        assertTrue((intResult.intValue() >= 5) && (intResult.intValue() <= 10));
//        // Test for Long range
//        Number longResult = RandomNumber.getRandomNumber(
//                (long) -100, (long) 2500);
//        assertTrue(longResult instanceof Long);
//        assertTrue((longResult.longValue() >= -100) && (longResult.longValue() <= 2500));
//        // Test for Float range
//        Number floatResult = RandomNumber.getRandomNumber(
//                (float) 2.5f, (float) 25.4f);
//        assertTrue(floatResult instanceof Float);
//        assertTrue((floatResult.floatValue() >= 2.5f) && (floatResult.floatValue() <= 25.4f));
//        // Test for Double range
//        Number doubleResult = RandomNumber.getRandomNumber(
//                (double) 100.12, (double) 200.28);
//        assertTrue(doubleResult instanceof Double);
//        assertTrue((doubleResult.doubleValue() >= 100.12) && (doubleResult.doubleValue() <= 200.28));
//        // Test for Double range
//        double d1 = (double) 100.12;
//        int d2 = (int) 200;
//        assertThrows(IllegalArgumentException.class,
//                () -> RandomNumber.getRandomNumber(d1, d2));
//    }

}
