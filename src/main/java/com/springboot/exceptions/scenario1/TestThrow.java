package com.springboot.exceptions.scenario1;

import static com.springboot.exceptions.scenario1.LargeNumDivisionLowerNumException.voteValidateException;

/**
 * @author prabhakar, @Date 02-08-2024
 */
public class TestThrow {

    static void  voteValidate(int age) {
        if (age < 18)
            voteValidateException(age);
        else
            System.out.println("Welcome to vote for Java-core programming.");
    }
    public static void main(String[] args) {
        voteValidate(13);
        System.out.println("1st Execution finished.");
        voteValidate(20);
        System.out.println("Execution finished. Thank you.");
    }
}
