package com.springboot.lld.realworldusages.string;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class ReverseString {

    /**
     * Reverse string.
     *
     * @param s the string to reverse
     * @return reversed string
     */
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Tests for {@link ReverseString#reverseString(String)}.
     */
//    @Test
//    void testReverseString() {
//        assertEquals("oof", ReverseString.reverseString("foo"));
//        assertEquals("ÖÄÅ321FED cba", ReverseString.reverseString("abc DEF123ÅÄÖ"));
//    }
}
