package com.springboot.lld.realworldusages.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author prabhakar, @Date 09-07-2025
 */

public class CommonLetters {

    /**
     * Find Common Characters inside given two strings.
     *
     * @param firstStr  first string
     * @param secondStr second string
     * @return Common Characters.
     */

    public static String getCommonLetters(String firstStr, String secondStr) {
        Set<String> commonLetters = new HashSet<>();
        for (Character currentChar : firstStr.toCharArray()) {
            if (isCommonLetter(secondStr, currentChar)) {
                commonLetters.add(currentChar.toString());
            }
        }
        return String.join(" ", commonLetters);
    }

    private static boolean isCommonLetter(String str, Character character ) {
        return str.contains(character.toString()) && Character.isLetter(character);
    }


    /*
     * Tests for {@link CommonLetters #getCommonLetters(String, String)}.
     */
    
    /*
    @Test
    void testgetCommonLetters() {
        String str = "abfcd!?055bcxaz^fg#)";
        String str2 = "b45893fndg%+1vc";
        assertEquals("b c d f g", CommonLetters.getCommonLetters(str, str2));
    }
    */
}
