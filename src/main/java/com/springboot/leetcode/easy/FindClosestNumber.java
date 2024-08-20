package com.springboot.leetcode.easy;

/**
 * @author prabhakar, @Date 20-08-2024
 */
public class FindClosestNumber {

    public static void main(String[] args) {
        int[] array = {-4,-2,1,4,7,8,10000};
        //int[] array = {2,-1,1};
        int closest = array[0];
        for (int num: array){
            // the number 2 is the greater than haven numbers
                    // for positive                 // for negative
            if ((closest > 0 && num < closest) || (closest < 0 && -num < -closest)){
                // or the condition change like this
                //if(Math.abs(num) < Math.abs(closest))
                closest = num;
            }// If there is a tie in absolute values, prefer the positive one
            else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }
        }
        System.out.println(closest);
    }
}
