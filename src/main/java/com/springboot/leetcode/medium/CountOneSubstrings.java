package com.springboot.leetcode.medium;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class CountOneSubstrings {
    public static void main(String[] args) {
        String s1 = "0110111";
        System.out.println("Number of substrings with only '1's: " + countOneSubstrings(s1)); // Output: 9

        String s2 = "101";
        System.out.println("Number of substrings with only '1's: " + countOneSubstrings(s2)); // Output: 2

        String s3 = "111111";
        System.out.println("Number of substrings with only '1's: " + countOneSubstrings(s3)); // Output: 21
    }

    public static int countOneSubstrings(String s) {
        long count = 0 , res = 0 , mod = (int)1e9+7 ;
        for(int i = 0 ; i < s.length() ; i++){
            count+=s.charAt(i)-'0';
            if(s.charAt(i)-'0'==0){
                res+=((count*(count+1))/2);
                count = 0 ;
            }
        }
        res+=((count*(count+1))/2);
        return (int)(res%mod);
    }
}
