package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 09-08-2025
 */

public class SieveOfEratosthenes {

    /**
     * Search an item with binarySearch algorithm.
     *
     * @param n range of number.
     * @return isPrime boolean array where prime number 0 to n are mark true.
     */
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    /**
     * Tests for {@link SieveOfEratosthenes(int)}.
     */

//    @Test
//    void testSieveOfEratosthenes() {
//        boolean[] arr = SieveOfEratosthenes.sieveOfEratosthenes(4);
//        assertEquals(true, arr[0]);
//        assertEquals(true, arr[1]);
//        assertEquals(true, arr[2]);
//        assertEquals(true, arr[3]);
//        assertEquals(false, arr[4]);
//
//        boolean[] arr2 = SieveOfEratosthenes.sieveOfEratosthenes(7);
//        assertEquals(true, arr2[0]);
//        assertEquals(true, arr2[1]);
//        assertEquals(true, arr2[2]);
//        assertEquals(true, arr2[3]);
//        assertEquals(false, arr2[4]);
//        assertEquals(true, arr2[5]);
//        assertEquals(false, arr2[6]);
//        assertEquals(true, arr2[7]);
//
//        boolean[] arr3 = SieveOfEratosthenes.sieveOfEratosthenes(2);
//        assertEquals(true, arr3[0]);
//        assertEquals(true, arr3[1]);
//        assertEquals(true, arr3[2]);
//    }

}
