package com.springboot.lld.realworldusages.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author prabhakar, @Date 09-07-2025
 */

public class DuplicateCharacter {

    /**
     * Remove Duplicate Characters from a string.
     *
     * @param str The string to be processed
     * @return A string with no duplicate characters
     */

    public static String removeDuplicateCharacter(String str) {
        char[] chars = str.toCharArray();
        Set<String> uniqueSet = new HashSet<String>();
        for (char c : chars) {
            uniqueSet.add(String.valueOf(c));
        }
        return String.join("", uniqueSet);
    }

    /*
     * Tests for {@link DuplicateCharacterSnippet#removeDuplicateCharacters(String)}.
     */

    /*
    @Test
    void testRemoveDuplicateCharacters() {
        assertEquals("z", DuplicateCharacterSnippet.removeDuplicateCharacters("zzzzzzzzzzzzzzzzz"));
        assertEquals("abcd", DuplicateCharacterSnippet.removeDuplicateCharacters("aabbccdd"));
        assertEquals("1289", DuplicateCharacterSnippet.removeDuplicateCharacters("1219218181921"));
    }
    */
}
