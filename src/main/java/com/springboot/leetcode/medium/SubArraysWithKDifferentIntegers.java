package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class SubArraysWithKDifferentIntegers {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 2, 3};
        int k1 = 2;
        System.out.println("Output: " + subArraysWithKDistinct(nums1, k1)); // Output: 7

        int[] nums2 = {1, 2, 1, 3, 4};
        int k2 = 3;
        System.out.println("Output: " + subArraysWithKDistinct(nums2, k2)); // Output: 3
    }

    public static int subArraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private static int atMostK(int[] nums, int k) {

        int[] count = new int[nums.length + 1];

        int left = 0, right = 0, distinct = 0, result = 0;

        while (right < nums.length) {
            if (count[nums[right]] == 0) {
                distinct++;
            }
            count[nums[right]]++;
            right++;

            while (distinct > k) {
                count[nums[left]]--;
                if (count[nums[left]] == 0) {
                    distinct--;
                }
                left++;
            }

            result += right - left;
        }

        return result;
    }
}
