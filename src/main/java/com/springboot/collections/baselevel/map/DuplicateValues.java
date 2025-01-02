package com.springboot.collections.baselevel.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author prabhakar, @Date 27-08-2024
 */

public class DuplicateValues {
    public static void main(String[] args) {
        int[] input = {10, 30, 25, 10, 40, 20, 10, 20, 10};

        // Map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // List to store the duplicates
        List<Integer> duplicates = new ArrayList<>();

        // Populate the frequency map
        for (int num : input) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Identify duplicates and add them to the list
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int count = entry.getValue();
            if (count > 1) {
                for (int i = 0; i < count - 1; i++) {
                    duplicates.add(entry.getKey());
                }
            }
        }

        // Print the duplicates
        System.out.println(duplicates);
    }
}

