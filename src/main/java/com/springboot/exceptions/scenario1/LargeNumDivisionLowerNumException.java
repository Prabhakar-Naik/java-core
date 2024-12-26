package com.springboot.exceptions.scenario1;

/**
 * @author prabhakar, @Date 26-06-2024
 */
public class LargeNumDivisionLowerNumException extends RuntimeException {

    public LargeNumDivisionLowerNumException() {
        super("Division by larger number is not allowed for modulo operation.");
    }

    public static String GivenNegativeValue(int num){
        return "Given Negative value "+num;
    }

    public static void voteValidateException(int age){
        System.out.println("You are not valid for vote");
    }
}
