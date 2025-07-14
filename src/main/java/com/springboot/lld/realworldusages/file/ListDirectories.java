package com.springboot.lld.realworldusages.file;

import java.io.File;

/**
 * @author prabhakar, @Date 12-07-2025
 */

public class ListDirectories {

    public static File[] listDirectories(String path) {
        //File dir = new File(path);
        //return dir.listFiles(File::isDirectory);
        return new File(path).listFiles(File::isDirectory);
    }

    /**
     * Tests for {@link ListDirectories#listDirectories(String)}.
     */
//    @Test
//    void testListDirectories() {
//        var files = ListDirectories.listDirectories("src/main/java/com/springboot/lld/sample/resources");
//        assertTrue(Arrays.stream(files).allMatch(File::isDirectory));
//        assertTrue(Arrays.asList(files).contains(new File("src/main/java/com/springboot/lld/sample/resources/dir1")));
//        assertTrue(Arrays.asList(files).contains(new File("src/main/java/com/springboot/lld/sample/resources/dir2")));
//    }

}
