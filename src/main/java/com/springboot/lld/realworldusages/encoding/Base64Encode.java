package com.springboot.lld.realworldusages.encoding;

import java.util.Base64;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class Base64Encode {

    /**
     * Encodes the input string to a Base64 encoded string.
     *
     * @param input string to be encoded
     * @return base64 encoded string
     */

    public static String encodeBase64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    /**
     * Tests for {@link Base64Encode#encodeBase64(String)}.
     */
    //@Test
    void testBase64Encoding() {
        var encodedString = Base64Encode.encodeBase64("TestString");
        //assertEquals("VGVzdFN0cmluZw==", encodedString);
    }

    /**
     * Tests for {@link Base64Encode#encodeBase64(String)} for empty input.
     */
    //@Test
    void testEmptyBase64Encoding() {
        var encodedString = Base64Encode.encodeBase64("");
        //assertEquals("", encodedString);
    }
}
