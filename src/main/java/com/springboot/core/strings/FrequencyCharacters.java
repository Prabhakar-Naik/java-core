package com.springboot.core.strings;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class FrequencyCharacters {

    public static void main(String[] args) {

        String text = "aaaabbbbaaacccccdddd$$$$";
        int[] arr = new int[256];

        for (int i=0; i<=text.length()-1;i++){
            char ch = text.charAt(i);
            int x = (int)ch ;
            arr[x]++;
        }

        for (int i=0; i<256;i++){
            if (arr[i] != 0)
                System.out.println((char) i+ ": "+ arr[i]);
        }
    }
}
