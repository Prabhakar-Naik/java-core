package com.springboot.lld.realworldusages.math;

import java.util.Random;

/**
 * @author prabhakar, @Date 12-07-2025
 */

public class DiceThrow {

    private static Random random = new Random();

    /**
     * Enum for standardized sided dice (4,6,8,10,12 and 20).
     */
    public enum DiceSides{
        FOUR(4), SIX(6), EIGHT(8),
        TEN(10), TWELVE(12), TWENTY(20);

        private final int diSides;

        DiceSides(int diSides) {
            this.diSides = diSides;
        }

        /**
         * Returns the number of sides of a dice.
         *
         * @return int denoting number of sides of a dice
         */
        public int getDiSides() {
            return diSides;
        }
    }

    /**
     * Returns the sum of sides for the given number of sides of each dice.
     *
     * @param noOfDice number of dice
     * @param sides sides of a dice
     * @return int sum of sides for number of dice
     */

    public static int throwDice(int noOfDice, DiceSides sides){
        int sum = 0;
        for (int i = 0; i < noOfDice; i++) {
            sum = sum + (1 + random.nextInt(sides.getDiSides()));
        }
        return sum;
    }


    /**
     * Tests for {@link DiceThrow #throwDice(int, DiceSides)}.
     */
//    @Test
//    void testThrowDice() {
//        // Test for Dice throw
//        assertTrue(DiceThrow.throwDice(3, DiceSides.SIX) <= 18);
//        assertTrue(DiceThrow.throwDice(2, DiceSides.FOUR) <= 8);
//        assertTrue(DiceThrow.throwDice(3, DiceSides.EIGHT) <= 24);
//        assertTrue(DiceThrow.throwDice(4, DiceSides.TEN) <= 40);
//        assertTrue(DiceThrow.throwDice(1, DiceSides.TWELVE) <= 12);
//        assertTrue(DiceThrow.throwDice(2, DiceSides.TWENTY) <= 40);
//        assertEquals(0, DiceThrow.throwDice(0, DiceSides.FOUR));
//
//    }

}
