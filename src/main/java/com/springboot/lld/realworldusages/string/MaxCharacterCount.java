package com.springboot.lld.realworldusages.string;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class MaxCharacterCount {

    /**
     * The maximum count of times a specific character appears in a string.
     *
     * @param str َA specific string
     * @param character A specific character
     * @return the maximum count of one character
     */

    public static int getMaxCharacterCount(String str, char character) {
        int characterCount = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                characterCount++;
                maxCount = Math.max(maxCount, characterCount);
            }else {
                characterCount = 0;
            }
        }
        return maxCount;
    }

    /**
     * Tests for {@link MaxCharacterCount#getMaxCharacterCount(String, char)}.
     */
//    @Test
//    void testgetMaxCharacterCount() {
//        assertEquals(5, MaxCharacterCount.getMaxCharacterCount("dddddsgddvcidd", 'd'));
//        assertEquals(4, MaxCharacterCount.getMaxCharacterCount("bbkfgjhgjkbbbb", 'b'));
//        assertEquals(6, MaxCharacterCount.getMaxCharacterCount("saalallaaaaaala", 'a'));
//        assertEquals(5, MaxCharacterCount.getMaxCharacterCount("66627g38hg66666066jg66", '6'));
//        assertEquals(0, MaxCharacterCount.getMaxCharacterCount("kdfjgkfjggjgg", 'v'));
//        assertEquals(3, MaxCharacterCount.getMaxCharacterCount("massmmmajtim", 'm'));
//    }
}
