package com.springboot.core.interviewqs;

import org.w3c.dom.CharacterData;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class StringExpander {
    public static void main(String[] args) {
        String input = "a3b10v5";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (StringExpander.isCharacter(ch)) {
                int j = i + 1;
                StringBuilder number = new StringBuilder();
                while (j < input.length() && Character.isDigit(input.charAt(j))) {
                    number.append(input.charAt(j));
                    j++;
                }
                int count = Integer.parseInt(number.toString());
                for (int k = 0; k < count; k++) {
                    output.append(ch);
                }
                // or
                //output.append(String.valueOf(ch).repeat(Math.max(0,count)));
                i = j - 1;
            }
        }

        System.out.println(output);
    }


    public static boolean isCharacter(char ch) {
        return Character.isLetter((int) ch);
    }


}

