package com.springboot.exceptions.demo;

import com.springboot.exceptions.scenario2.ArithmeticExceptions;

/**
 * @author prabhakar, @Date 25-06-2025
 */

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int divide = divide(10, 2);
            System.out.println(divide);
            int divide2 = divide(10, 0);
            System.out.println(divide2);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        return divide1(dividend, divisor);
    }

    public static int divide1(int dividend, int divisor) throws RuntimeException {
        if (divisor == 0) {
            //throw new ArithmeticException("Can not Division by zero");
            System.out.println("Can not Division by zero");
        }
        return dividend / divisor;
    }


}
