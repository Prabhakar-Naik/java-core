package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 24-08-2024
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer that is pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        MaxArea solution = new MaxArea();

        // Test case 1
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height1)); // Output: 49

        // Test case 2
        int[] height2 = {1,1};
        System.out.println(solution.maxArea(height2)); // Output: 1
    }
}
