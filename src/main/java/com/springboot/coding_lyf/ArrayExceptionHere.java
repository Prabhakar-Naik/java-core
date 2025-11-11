package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class ArrayExceptionHere {

    public static void main(String[] args) {
        System.out.println("Result: "+testMethod());
    }

    public static int testMethod(){
        try{
            int[] arr = new int[5];
            arr[5] = 10;
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return 2;
        }catch (Exception e){
            return 3;
        }
    }
}
