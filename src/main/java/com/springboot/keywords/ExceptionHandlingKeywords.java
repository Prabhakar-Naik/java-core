package com.springboot.keywords;

import java.io.IOException;

/**
 * @author prabhakar, @Date 24-12-2024
 */
public class ExceptionHandlingKeywords {


    public static void main(String[] args) {

        //try: Defines a block of code to test for exceptions.
        try {
            int result = 10 / 0;

            //catch: Handles the exception thrown in the try block
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }


        //finally: Defines a block of code that will always execute after
        // the try (and catch, if present), regardless of whether an exception occurred.

        finally {
            System.out.println("Cleanup done.");
        }

        //throw: Used to explicitly throw an exception.
        throw new IllegalArgumentException("Invalid input!");


    }

    //throws: Declares the exceptions that a method might throw.
    public void myMethod() throws IOException {
        throw new IOException("Error occurred!");
    }

}
