package com.springboot.lld.realworldusages.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class InputStreamToString {

    /**
     * Convert InputStream to String.
     *
     * @param inputStream InputStream to convert
     * @return String
     */

    public static String inputStreamToString(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .lines().collect(Collectors.joining(System.lineSeparator()));
    }

    /**
     * Tests for {@link InputStreamToString#inputStreamToString(InputStream)}.
     */

    //@Test
    void testInputStreamToString() throws IOException {
        String newLine = System.getProperty("line.separator");
        String str = new StringBuilder()
                .append("ąćśź").append(newLine)
                .append("←≠²³¢²€").append(newLine)
                .append("июля").append(newLine)
                .append("åøä").append(newLine)
                .append("ñí").append(newLine)
                .append("7月15日起").append(newLine)
                .append("خەيرلىك ئەتىگەن!").append(newLine)
                .append("Hello Prabhakar")
                .toString();

//        assertEquals(str, InputStreamToString.inputStreamToString(
//                new FileInputStream("src/main/java/com/springboot/lld/realworldusages/resources/dir1/placeholder.txt")));
//        assertNotEquals(str.toUpperCase(), InputStreamToString.inputStreamToString(
//                new FileInputStream("src/main/java/com/springboot/lld/realworldusages/resources/dir1/placeholder.txt")));
    }
}
