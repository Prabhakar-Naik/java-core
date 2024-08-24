package com.springboot.leetcode.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author prabhakar, @Date 23-08-2024
 */
public class FractionAdditionAndSubtraction {

    public static String fractionAddition(String expression) {
        Pattern pattern = Pattern.compile("([+-]?\\d+)/(\\d+)");
        Matcher matcher = pattern.matcher(expression);

        int numerator = 0;
        int denominator = 1;

        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group(1));
            int denom = Integer.parseInt(matcher.group(2));
            numerator = numerator * denom + num * denominator;
            denominator *= denom;
        }

        int gcd = gcd(Math.abs(numerator), denominator);
        numerator /= gcd;
        denominator /= gcd;

        return numerator + "/" + denominator;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String expression = "-1/2+1/2+1/3";
        String result = fractionAddition(expression);
        System.out.println(result); // Output: 1/3
    }
}
