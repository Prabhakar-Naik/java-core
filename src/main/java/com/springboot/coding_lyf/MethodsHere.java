package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class MethodsHere {

    public static void main(String[] args) {
        System.out.println("Result: "+outerMethod());
    }

    public static int outerMethod(){
        try{
            return innerMethod();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 1;
        }
    }

    public static int innerMethod(){
        try {
            int result = 10/0;
            return result;
        }catch (ArithmeticException e){
            System.out.println("Inner exception");
            return 3;
        }
    }
}
