package com.springboot.lld.realworldusages.string;

/**
 * @author prabhakar, @Date 09-07-2025
 */

public class FormatBytes {

    /*
     * Convert bytes into Human readable form.
     *
     * @param bytes The value in bytes needed to be converted
     * @return String the converted human-readable form
     */

    public static String formatBytes(long bytes) {
        double kb = 1024;
        double mb = kb * 1024;
        double gb = mb * 1024;
        double tb = gb * 1024;

        if ((bytes >= 0) && (bytes < kb))
            return bytes + " B";
        else if ((bytes >= kb) && (bytes < mb))
            return String.format("%.2f KB", bytes/kb);
        else if ((bytes >= mb) && (bytes < gb))
            return String.format("%.2f MB", bytes/mb);
        else if ((bytes >= gb) && (bytes < tb))
            return String.format("%.2f GB", bytes/gb);
        else if ((bytes >= tb))
            return String.format("%.2f TB", bytes/tb);
        else
            return "Invalid Input";
    }

    /*
     *  Tests for {@link FormatBytesSnippet#formatBytes(long)}.
     */

    /*
    @Test
    void formatBytes() {
        assertEquals("1.46 MB", FormatBytes.formatBytes(1536000));
        assertEquals("4.00 GB", FormatBytes.formatBytes(4294967296L));
        assertEquals("3.00 TB", FormatBytes.formatBytes(3L * 1024 * 1024 * 1024 * 1024));
        assertEquals("1024.00 MB", FormatBytes.formatBytes(1024L * 1024 * 1024 - 1));
        assertEquals("Invalid Input", FormatBytes.formatBytes(-1024));
        assertEquals("8388608.00 TB", FormatBytes.formatBytes(Long.MAX_VALUE));
    }
    */
}
