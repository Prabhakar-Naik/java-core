package com.springboot.core.basic;

import com.springboot.exceptions.scenario1.LargeNumDivisionLowerNumException;

/**
 * @author prabhakar, @Date 26-06-2024
 */
public class Division {

    public static void main(String[] args) {

        // this is the sample for custom exception the java given result is right

        int x =30;
        int y = 20;
        if (x > y)
            System.out.println(x%y);
        else
            throw new LargeNumDivisionLowerNumException();

    }
}
