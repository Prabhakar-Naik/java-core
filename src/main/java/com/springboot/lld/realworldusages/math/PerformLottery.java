package com.springboot.lld.realworldusages.math;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author prabhakar, @Date 15-07-2025
 */

public class PerformLottery {

    /**
     * Generate random lottery numbers.
     *
     * @param numNumbers    how many performLottery numbers are available (e.g. 49)
     * @param numbersToPick how many numbers the player needs to pick (e.g. 6)
     * @return array with the random numbers
     */

    public static Integer[] performLottery(Integer numNumbers, int numbersToPick) {
        var numbers = new ArrayList<>();
        for (var i = 0; i < numNumbers; i++){
            numbers.add(i + 1);
        }
        Collections.shuffle(numbers);
        return numbers.subList(0, numbersToPick).toArray(new Integer[numbersToPick]);
    }


    /**
     * Tests for {@link PerformLottery#performLottery(Integer, int)}.
     */
//    @Test
//    void testPerformLottery() {
//        var numbers0 = PerformLottery.performLottery(0, 0);
//        assertArrayEquals(new Integer[] {}, numbers0);
//        var numbers1 = PerformLottery.performLottery(1, 1);
//        assertArrayEquals(new Integer[] {1}, numbers1);
//        var numbers2 = PerformLottery.performLottery(2, 2);
//        assertEquals(2, numbers2.length);
//        assertTrue(numbers2[0] == 1 || numbers2[0] == 2);
//        assertTrue(numbers2[1] == 1 || numbers2[1] == 2);
//    }

}
