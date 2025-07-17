package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class LuhnCheckSum {

    /**
     * Calculates checksum for a given number with Luhn's algorithm. Works only on non-negative
     * integers not greater than {@link Long#MAX_VALUE} i.e., all numbers with a maximum of 18
     * digits, plus 19-digit-long numbers start with 1..8 (also some with 9, too). For
     * demonstration purposes, algorithm is not optimized for efficiency.
     *
     * @param num number whose checksum is to be calculated
     * @return checksum value for num
     * @see <a href="https://patents.google.com/patent/US2950048A">Hans P. LUHN's patent US2950048A</a>
     * @see <a href="https://en.wikipedia.org/wiki/Luhn_algorithm">Luhn algorithm on Wikipedia</a>
     */

    public static int calculateLuhnChecksum(long num) {
        if (num < 0) {
            throw new IllegalArgumentException("num must be a positive number");
        }
        final var numStr = String.valueOf(num);

        var sum = 0;
        var isOddPosition = true;
        // Loop on digits of numStr from right to left.
        for (int i = numStr.length() - 1; i >= 0; i--) {
            final var digit = Integer.parseInt(Character.toString(numStr.charAt(i)));
            final var substituteDigit = (isOddPosition ? 2: 1) * digit;

            final var tensPlaceDigit = substituteDigit / 10;
            final var onesPlaceDigit = substituteDigit % 10;
            sum += tensPlaceDigit + onesPlaceDigit;
            isOddPosition = !isOddPosition;
        }
        final var checkSumDigit = (10 - (sum % 10)) % 10;
        // Outermost modulus handles edge case `num = 0`.
        return checkSumDigit;
    }

/*    @CsvSource({
            "0, 0",
            "1, 8",
            "4, 2",
            "5, 9",
            "9, 1",

            "42, 2",

            // Moderately interesting patterns.
            "10, 9",
            "11, 7",
            "12, 5",
            "100, 8",
            "101, 6",
            "102, 4",
            "1000, 9",
            "1001, 7",
            "1002, 5",
            "10000, 8",
            "10001, 6",
            "10002, 4", // etc.

            // Can detect any single-digit error.
            "4872148, 4", // Original number (Luhn's example in patent US2950048A).
            "4872143, 5",
            //     ^
            "4872178, 1",
            //    ^

            // Can detect many transposition of adjacent digits.
            "4872418, 1",
            //   ^^
            "4872184, 9",
            //    ^^

            // Can not detect some transposition of adjacent digits.
            "109223344, 2", // Original number.
            "190223344, 2", // 09<-->90
            //^^
            "109553344, 2", // 22<-->55
            //  ^^
            "109226644, 2", // 33<-->66
            //    ^^
            "109223377, 2", // 44<-->77
            //      ^^
            "190226644, 2", // Some of the above together.
            //^^  ^^
            "190556677, 2", // All of the above together.
            //^^^^^^^^
    })
    @ParameterizedTest
    void testLuhnCalculateChecksum(long num, int expectedChecksum) {
        assertEquals(expectedChecksum, LuhnCheckSum.calculateLuhnChecksum(num));
    }
    */

}
