package com.springboot.exceptions.scenario2;

import com.springboot.collections.dynamicexample.Student;

/**
 * @author prabhakar, @Date 25-12-2024
 */
// Program will crash during runtime errors is called Exception.
public class Exceptions {

    /*
    Exception is an event that disrupts the normal flow of the program.
    It is an object which is thrown at runtime.
    */

    // Type of Errors in Java
    // 1. Syntax Error
    // 2. Logical Error
    // 3. Runtime Error

/*  // 1. Syntax Error
    public static int divide(int a, int b) {
        // 1. Syntax Error
        return a // b;
    }
*/

    // 2. Logical Error
    // if you pass b value is 0 it will give arithmetic error
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (NullPointerException e) {
            System.out.println(e);
            return -1;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        } catch (RuntimeException e) {
            System.out.println(e);
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    // 3. Runtime Error
    public static void main(String[] args) {

//        Student student = new Student();
        /*
        Student stu = null;         // NullPointerException
        stu.setSid(123);
        System.out.println(stu);
        */
//        System.out.println(student);        // by default toString() given hashcode

        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Good Job :)");
    }


}
