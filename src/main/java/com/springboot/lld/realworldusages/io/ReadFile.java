package com.springboot.lld.realworldusages.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class ReadFile {

    /**
     * Read file using stream and return list of string lines.
     *
     * @param fileName file to read
     * @throws FileNotFoundException if an I/O error occurs
     */

    public static List<String> readFile(String fileName) throws FileNotFoundException {
        try (Stream<String> stream = new BufferedReader(new FileReader(fileName)).lines()) {
            return stream.collect(Collectors.toList());
        }
    }

    /**
     * Tests for {@link ReadFile#readFile(String)}.
     */
    //@Test
    void testReadFile() throws FileNotFoundException {
//        assertEquals("foo", ReadFile.readFile("src/main/java/com/springboot/lld/realworldusages/resources/somelines.txt").get(0));
//        assertEquals("bar", ReadFile.readFile("src/main/java/com/springboot/lld/realworldusages/resources/somelines.txt").get(1));
//        assertEquals("baz", ReadFile.readFile("src/main/java/com/springboot/lld/realworldusages/resources/somelines.txt").get(2));
//        assertNotEquals("abc", ReadFile.readFile("src/main/java/com/springboot/lld/realworldusages/resources/somelines.txt").get(1));
    }
}
