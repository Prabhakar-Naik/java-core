package com.springboot.lld.realworldusages.encoding;

import java.util.Base64;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class Base64Decode {


    /**
     * Decodes a Base64 encoded string to the actual representation.
     *
     * @param input base64 encoded string
     * @return decoded string
     */

    public static String decodeBase64(String input) {
        return new String(Base64.getDecoder().decode(input.getBytes()));
    }

    /**
     * Tests for {@link Base64Decode#decodeBase64(String)}.
     */

    //@Test
    void testBase64Decoding() {
        var decodedString = Base64Decode.decodeBase64("VGVzdFN0cmluZw==");
        //assertEquals("TestString", decodedString);
    }

    /**
     * Tests for {@link Base64Decode#decodeBase64(String)} with empty input.
     */
    //@Test
    void testEmptyBase64Decoding() {
        var decodedString = Base64Decode.decodeBase64("");
        //assertEquals("", decodedString);
    }
}
