package com.springboot.lld.realworldusages.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author prabhakar, @Date 17-07-2025
 */

public class ArrayMode {

    /**
     * Private constructor to prevent instantiation.
     */
    private ArrayMode(){
        throw new IllegalStateException("Utility class");
    }


    /**
     * Returns the mode(s) of the array.
     * If multiple modes exist, it returns them in a list.
     */

    public static List<Integer> modeArray(int[] arr){
        int maxCount = 0;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num: arr){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, frequencyMap.get(num));
        }
        List<Integer> listModes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            if (entry.getValue() == maxCount){
                listModes.add(entry.getKey());
            }
        }
        return listModes;
    }


    /**
     * Test for {@link ArrayMode#modeArray(int[])}.
     */
//    @Test
//    void testModeArray() {
//        assertEquals(List.of(2), ArrayMode.modeArray(new int[]{1, 2, 2, 3}));
//        assertEquals(List.of(2, 3), ArrayMode.modeArray(new int[]{1, 2, 2, 3, 3}));
//        assertEquals(List.of(1, 2, 3, 4), ArrayMode.modeArray(new int[]{1, 2, 3, 4}));
//        assertEquals(List.of(), ArrayMode.modeArray(new int[]{}));
//        assertEquals(List.of(-1, -2), ArrayMode.modeArray(new int[]{-1, -1, -2, -2, -3}));
//    }

}
