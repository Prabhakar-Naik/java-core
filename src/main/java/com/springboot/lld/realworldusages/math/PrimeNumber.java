package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class PrimeNumber {

    /**
     * Checks if given number is a prime number. Prime number is a number that is greater than 1 and
     * divided by 1 or itself only Credits: https://en.wikipedia.org/wiki/Prime_number
     *
     * @param number number to check prime
     * @return true if prime
     */
    public static boolean isPrime(int number){
        //if number < 2 its not a prime number
        if (number < 2) return false;

        // 2 and 3 are prime numbers
        if (number < 3) return true;

        // check if n is a multiple of 2
        if (number % 2 == 0) return false;

        // if not, then just check the odds
        for (var i =3; i * i <= number; i += 2){
            if (number % i == 0) return false;
        }

        return true;
    }

    /**
     * Tests for {@link PrimeNumber#isPrime(int)}.
     */
//    @Test
//    void testIsPrime() {
//        assertFalse(PrimeNumber.isPrime(-1));
//        assertTrue(PrimeNumber.isPrime(2));
//        assertTrue(PrimeNumber.isPrime(3));
//        assertTrue(PrimeNumber.isPrime(17));
//        assertTrue(PrimeNumber.isPrime(97));
//        assertFalse(PrimeNumber.isPrime(-1));
//        assertFalse(PrimeNumber.isPrime(4));
//        assertFalse(PrimeNumber.isPrime(100));
//    }

}
