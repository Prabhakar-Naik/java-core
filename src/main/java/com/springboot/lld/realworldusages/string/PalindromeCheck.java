package com.springboot.lld.realworldusages.string;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class PalindromeCheck {

    /**
     * Checks if given string is palindrome (same forward and backward). Skips non-letter characters
     * Credits: https://github.com/kousen/java_8_recipes
     *
     * @param str string to check
     * @return true if palindrome
     */
    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetter(str.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetter(str.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Tests for {@link PalindromeCheck#isPalindrome(String)}.
     */
//    @Test
//    void testIsPalindrome() {
//        assertTrue(PalindromeCheck.isPalindrome("saippuakauppias"));
//        // non-letter characters are skipped
//        assertTrue(PalindromeCheck.isPalindrome("111 Saippua - Kauppias 321"));
//        assertFalse(PalindromeCheck.isPalindrome("Type O Negative"));
//        assertFalse(PalindromeCheck.isPalindrome("Foo12121Bar"));
//    }

}
