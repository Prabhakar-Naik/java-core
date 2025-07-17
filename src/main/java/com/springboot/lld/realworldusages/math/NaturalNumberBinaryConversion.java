package com.springboot.lld.realworldusages.math;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class NaturalNumberBinaryConversion {

    /**
     * Convert natural number to binary string. Only supports positive integers.Throws exception
     * for negative integers
     *
     * @param naturalNumber given number
     * @return Binary string representation of naturalNumber
     */
    public static String toBinary(long naturalNumber) {
        if (naturalNumber < 0)
            throw new NumberFormatException("Negative Integer, this snippet only accepts positive integers");

        if (naturalNumber == 0)
            return "0";

        final Stack<Long> binaryBits =
                Stream.iterate(naturalNumber, n -> n > 0, n -> n / 2).map(n -> n % 2)
                        .collect(Stack::new, Stack::push,Stack::addAll);
        return Stream.generate(binaryBits::pop)
                .limit(binaryBits.size()).map(String::valueOf).collect(Collectors.joining());
    }


    /**
     * Convert binary string representation to Long valued Integer. Throws exception if input
     * string contains characters other than '0' and '1'
     *
     * @param binary given number
     * @return Unsigned Long value for the binary number
     */

    public static Long fromBinary(String binary) {
        binary.chars().filter(c -> c != '0' && c != '1')
                .findFirst().ifPresent(in -> {
                    throw new NumberFormatException( "Binary string contains values other than '0' and '1'");
                });
        return IntStream.range(0, binary.length()).filter(in -> binary.charAt(binary.length() - 1 - in) == '1')
                .mapToLong(in -> ((long) 0b1) << in).sum();

    }

     // tests
//     @Test
//     void convertPositiveIntegerToBinary() {
//         assertEquals("0", NaturalNumberBinaryConversion.toBinary(0));
//         assertEquals("11", NaturalNumberBinaryConversion.toBinary(3));
//         assertEquals("101", NaturalNumberBinaryConversion.toBinary(5));
//         assertEquals("10000000000", NaturalNumberBinaryConversion.toBinary(0b10000000000));
//         assertEquals("10000000000", NaturalNumberBinaryConversion.toBinary(1024));
//         assertEquals("11111111", NaturalNumberBinaryConversion.toBinary(0xFF));
//         assertEquals("110110", NaturalNumberBinaryConversion.toBinary(066));
//     }
//
//    @Test
//    void negativeIntegerToBinaryConversionThrowsException() {
//        assertThrows(NumberFormatException.class,
//                () -> NaturalNumberBinaryConversion.toBinary(-3));
//    }
//
//    @Test
//    void convertBinaryStringToInteger() {
//        assertEquals(3, NaturalNumberBinaryConversion.fromBinary("11"));
//        assertEquals(6, NaturalNumberBinaryConversion.fromBinary("110"));
//        assertEquals(0x5c, NaturalNumberBinaryConversion.fromBinary("01011100"));
//        assertEquals(127, NaturalNumberBinaryConversion.fromBinary("1111111"));
//    }
//
//
//    @Test
//    void invalidBinaryStringToIntegerConversionThrowsException() {
//        assertThrows(NumberFormatException.class,
//                () -> NaturalNumberBinaryConversion.fromBinary("12"));
//    }

}
