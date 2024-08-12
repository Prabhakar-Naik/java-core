package com.springboot.leetcode;

/**
 * @author prabhakar, @Date 12-08-2024
 */
public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) {
            return len;
        }

        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    /*
    get the count of remaining when you remove the target element.
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]

    Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3,_,_,_]
    */

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3,2,2,3},3));
        System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2},2));

    }
}
