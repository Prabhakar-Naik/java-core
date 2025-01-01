package com.springboot.generics.genericenums;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class MainOperations {

    public static void main(String[] args) {

        double result = Operation.ADDITION.apply(10,20);
        System.out.println("ADDITION: "+result);

        result = Operation.MULTIPLICATION.apply(10,20);
        System.out.println("MULTIPLICATION: "+result);

        result = Operation.SUBTRACTION.apply(30, 14);
        System.out.println("SUBTRACTION: "+result);

        result = Operation.DIVISION.apply(20, 10);
        System.out.println("DIVISION: "+result);

        result = Operation.REMAINDER.apply(21, 7);
        System.out.println("REMAINDER: "+result);

    }
}
