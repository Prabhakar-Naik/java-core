package com.springboot.lld.realworldusages.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author prabhakar, @Date 12-07-2025
 */

public class ReadLines {

    /**
     * Read file as list of strings.
     *
     * @param filename the filename to read from
     * @return list of strings
     * @throws IOException if an I/O error occurs
     */
    public static List<String> readLines(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }

    /**
     * Tests for {@link ReadLines#readLines(String)}.
     *
     * @throws IOException if an I/O error occurs
     */
//    @Test
//    void testReadLines() throws IOException {
//        var somelines = ReadLines.readLines("src/main/java/com/springboot/lld/sample/resources/someline.txt");
//        assertEquals(3, somelines.size());
//        assertEquals("foo", somelines.get(0));
//        assertEquals("bar", somelines.get(1));
//        assertEquals("baz", somelines.get(2));
//        assertThrows(IOException.class, () -> ReadLines
//                .readLines("some/nonexistent/filename.txt"));
//    }

}
