package com.springboot.core.interviewqs;

/**
 * @author prabhakar, @Date 20-07-2024
 */
public class FrequentConsecutive {

    // input: "aaabbbcccaaa"
    // output: a3b3c3a3

    public static void main(String[] args) {

        String string = "aaaabbbcccaaa";

        System.out.println(frequentConsecutive(string));

        StringBuilder str = new StringBuilder();

        if (string == null || string.isEmpty())
            return;

        char currentChar = string.charAt(0);

        int count =1;

        for (int i = 1; i<string.length();i++){

            if (currentChar == string.charAt(i)){
                count++;
            }else {
                str.append(currentChar);
                str.append(count);
                currentChar = string.charAt(i);
                count = 1;
            }
        }
        str.append(currentChar);
        str.append(count);
        System.out.println(str);

    }
    public static String frequentConsecutive(String input){
        StringBuilder str = new StringBuilder();

        if (input == null || input.isEmpty())
            return "";

        char currentChar = input.charAt(0);

        int count =1;

        for (int i = 1; i<input.length();i++){

            if (currentChar == input.charAt(i)){
                count++;
            }else {
                str.append(currentChar);
                str.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        str.append(currentChar);
        str.append(count);
        return str.toString();
    }
}
