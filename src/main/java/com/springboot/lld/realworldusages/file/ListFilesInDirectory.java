package com.springboot.lld.realworldusages.file;

import java.io.File;

/**
 * @author prabhakar, @Date 12-07-2025
 */

public class ListFilesInDirectory {

    /**
     * List files in directory.
     *
     * @param folder the path where to look
     * @return array of File
     */
    public static File[] listFilesInDirectory(String folder) {
        return new File(folder).listFiles(File::isFile);
    }

    /**
     * Tests for {@link ListFilesInDirectory#listFilesInDirectory(File)}.
     */
//    void testListFilesInDirectory() {
//        var files = ListFilesInDirectory.listFilesInDirectory(
//                Paths.get("src/main/java/com/springboot/lld/", "sample/resources").toString()
//        );
//        assertEquals(2, files.length);
//        var filenames = new HashSet<>(Arrays.asList(files[0].toString(), files[1].toString()));
//        assertTrue(filenames.contains(
//                Paths.get("src/main/java/com/springboot/lld/", "sample/", "resources", "somelines.txt").toString()
//        ));
//        assertTrue(filenames.contains(
//                Paths.get("src/main/java/com/springboot/lld/", "sample/", "resources", "someotherlines.txt").toString()
//        ));
//    }
}
