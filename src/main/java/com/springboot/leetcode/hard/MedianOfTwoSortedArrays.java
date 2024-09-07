package com.springboot.leetcode.hard;

/**
 * @author prabhakar, @Date 12-08-2024
 */
public class MedianOfTwoSortedArrays {

    // easy to understand
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int half = total / 2;
        int count = 0, i = 0, j = 0, num1 = 0, num2 = 0;

        while (count <= half) {
            num2 = num1;
            if (i == m) {
                num1 = nums2[j++];
            } else if (j == n) {
                num1 = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                num1 = nums1[i++];
            } else {
                num1 = nums2[j++];
            }
            count++;
        }

        return (total & 1) == 0 ? (num1 + num2) / 2.0 : num1;
    }

    /*
Given two sorted arrays nums1 and nums2 of size m and n respectively,
return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
    */
    public static void main(String[] args) {
        MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();
        int[] nums1 = {1,3}, nums2 = {2}; // ex: 1
        System.out.println(findMedianSortedArrays(nums1,nums2));
        nums1 = new int[]{1,2}; // ex: 2
        nums2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
        nums1 = new int[]{1,3};     // ex: 1 for complex code
        nums2 = new int[]{2};
        System.out.println(obj.findMedianSortedArrays1(nums1,nums2));
        nums1 = new int[]{1,2};     // ex: 2 for complex code
        nums2 = new int[]{3,4};
        System.out.println(obj.findMedianSortedArrays1(nums1,nums2));

    }


    // Complex to understand
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        // Ensure nums1 is shorter
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }

        int left = 0, right = m;
        while (left <= right) {
            int partitionX = left + (right - left) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = partitionX == m ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = partitionY == n ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                right = partitionX - 1;
            } else {
                left = partitionX + 1;

            }
        }
        return 0.0; // Should not reach here
    }
}
