package com.springboot.arrays;

/**
 * @author prabhakar, @Date 10-10-2024
 */
import java.util.Arrays;

public class CannibalProblem {
    public static int[] findSurvivingFish(int[] fish, int n) {
        int survivingCount = 0;
        for (int i = 0; i < n; i++) {
            boolean survived = true;
            for (int j = i + 1; j < n; j++) {
                if (fish[i] >= fish[j]) {
                    survived = false;
                    break;
                }
            }
            if (survived) {
                survivingCount++;
            }
        }

        int[] survivingFish = new int[survivingCount];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean survived = true;
            for (int j = i + 1; j < n; j++) {
                if (fish[i] >= fish[j]) {
                    survived = false;
                    break;
                }
            }
            if (survived) {
                survivingFish[index++] = fish[i];
            }
        }

        return survivingFish;
    }

    public static void main(String[] args) {
        int[] fish = {5, 3, 7, 30};
        int n = fish.length;
        int[] survivingFish = findSurvivingFish(fish, n);
        System.out.println(Arrays.toString(survivingFish));
    }
}
