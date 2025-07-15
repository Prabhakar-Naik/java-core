package com.springboot.lld.realworldusages.string;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 09-07-2025
 */

public class Anagram {


    /**
     * Anagram logic.
     *  Checks if two words are anagrams (contains same characters with same frequency
     *  in any order).
     *
     *  @param s1 The first string to be checked
     *  @param s2 The second string to be checked
     *  @return true if they are anagrams of each other
     */

    public static boolean isAnagram(String s1, String s2) {
        var l1 = s1.length();
        var l2 = s2.length();

        if (l1 != l2)
            return false;

        var arr1 = new int[256];
        var arr2 = new int[256];

        for (var i = 0; i < l1; i++) {
            arr1[s1.charAt(i)]++;
            arr2[s2.charAt(i)]++;
        }
        return Arrays.equals(arr1, arr2);
    }

    /*
     * Tests for {@link Anagram #isAnagram(String, String)}.
     */

    /*
    @Test
    void testIsAnagram() {
        assertTrue(Anagram.isAnagram("Aditya", "aytdiA"));
        assertFalse(Anagram.isAnagram("Aditya", "aytida"));
        assertTrue(Anagram.isAnagram("~~# @!", "~@!#~ "));
        assertTrue(Anagram.isAnagram("Mother In Law", "hIt Ler woMan"));
        assertFalse(Anagram.isAnagram("aa", "aaa"));
    }
    */
}
