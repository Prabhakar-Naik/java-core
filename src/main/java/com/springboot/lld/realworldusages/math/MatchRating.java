package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 14-07-2025
 */

public class MatchRating {

    static final int BASE = 400; //Two types are popular - 400 and 480. We will choose 400 here
    static final int RATING_ADJUSTMENT_FACTOR = 32; //32 is the standard for Beginner Games

    /**
     * Match Rating Snippet to calculate result after a single match.
     *
     * @param firstPlayerRating  Rating of the first player.
     * @param secondPlayerRating Rating of the second player.
     * @param result             Result of the match, always considered with respect to the first player.
     *                           1 indicates a win, 0.5 indicates a draw and 0 indicates a loss.
     * @return Returns the new rating of the first player.
     */

    public static double calculateMatchRating(double firstPlayerRating, double secondPlayerRating, double result) {
        double ratingDifference = ((secondPlayerRating - firstPlayerRating) * 1.0) / BASE;

        double logisticDifference = Math.pow(10, ratingDifference);
        double firstPlayerExpectedScore = 1.0 / (1 + logisticDifference);
        double firstPlayerActualScore = result;
        double newRating = firstPlayerRating + RATING_ADJUSTMENT_FACTOR * (firstPlayerActualScore - firstPlayerExpectedScore);
        return newRating;
    }

    /**
     * Tests for {@link #calculateMatchRating(double, double, double)}.
     */
//    @Test
//    void testSingleMatchRatings() {
//
//        //No rating change for draw between players of equal strength
//        assertEquals(1500.0, MatchRating.calculateMatchRating(1500, 1500, 0.5), DELTA);
//
//        //For a win against a very high leveled player, we should get max points
//        assertEquals(1532.0, MatchRating.calculateMatchRating(1500, 3000, 1.0), DELTA);
//
//        //For a loss against a very low leveled player, we should lose max points
//        assertEquals(2968.0, MatchRating.calculateMatchRating(3000, 1500, 0.0), DELTA);
//
//        //Use a random result for testing purposes. A 100 point difference is
//        //typically 20~21 points difference in elo
//        assertEquals(1520.48, MatchRating.calculateMatchRating(1500, 1600, 1.0), DELTA);
//    }
}
