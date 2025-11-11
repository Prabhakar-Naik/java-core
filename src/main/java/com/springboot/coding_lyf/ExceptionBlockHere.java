package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class ExceptionBlockHere {

    public static void main(String[] args) {
        System.out.println(testMethod());
        System.out.println(testMethod1());
    }

    public static int testMethod(){
        try {
            return 10;
        }finally {
            return 20;
        }
    }

    public static String testMethod1(){
        try {
            int i = 10/0;
        }catch (Exception e){
            //e.printStackTrace();
            return "Caught in testMethod1";
        }finally {
            return "Finally in testMethod1";
        }
    }
}
