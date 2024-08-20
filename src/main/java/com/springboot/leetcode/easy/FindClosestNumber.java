package com.springboot.leetcode.easy;

/**
 * @author prabhakar, @Date 20-08-2024
 */
public class FindClosestNumber {

    public static void main(String[] args) {
        int[] array = {-4,-2,1,4,8};
        //int[] array = {2,-1,1};
        int closest = array[0];
        for (int num: array){
            // for positive
            if ((closest > 0 && num < closest) || (closest < 0 && -num < -closest)){   // for negative
                closest = num;
            }
        }
        System.out.println(closest);
    }
}
