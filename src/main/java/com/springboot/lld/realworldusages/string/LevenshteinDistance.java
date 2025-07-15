package com.springboot.lld.realworldusages.string;

/**
 * @author prabhakar, @Date 11-07-2025
 */

public class LevenshteinDistance {

    /**
     * Find the Levenshtein distance between two words. https://en.wikipedia.org/wiki/Levenshtein_distance
     *
     * @param word1 first word
     * @param word2 second word
     * @return distance
     */

    public static int findLevenshteinDistance(String word1, String word2) {
        // If word2 is empty, removing
        int[][] ans = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            ans[i][0] = i;
        }

        // if word1 is empty, adding
        for (int j = 0; j <= word2.length(); j++) {
            ans[0][j] = j;
        }

        // None is empty
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                int min = Math.min(Math.min(ans[i][j - 1], ans[i - 1][j]), ans[i - 1][j - 1]);
                ans[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? ans[i - 1][j - 1] : min + 1;
            }
        }
        return ans[word1.length()][word2.length()];
    }


    /**
     * Tests for {@link LevenshteinDistance#findLevenshteinDistance(String, String)}.
     */
//    @Test
//    void testFindLevenshteinDistance() {
//        assertEquals(3, LevenshteinDistance.findLevenshteinDistance("kitten", "kit"));
//        assertEquals(6, LevenshteinDistance.findLevenshteinDistance("kitten", ""));
//        assertEquals(7, LevenshteinDistance.findLevenshteinDistance("", "sitting"));
//        assertEquals(3, LevenshteinDistance.findLevenshteinDistance("kitten", "sitting"));
//        assertEquals(5, LevenshteinDistance.findLevenshteinDistance("intention", "execution"));
//        assertEquals(10, LevenshteinDistance.findLevenshteinDistance("zoologicoarchaeologist", "zoogeologist"));
//    }
}
