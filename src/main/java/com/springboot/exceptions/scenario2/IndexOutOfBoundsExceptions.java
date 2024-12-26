package com.springboot.exceptions.scenario2;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class IndexOutOfBoundsExceptions {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[4]=10;

//        System.out.println(arr[5]);
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(arr[i]);
                }catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        // user defined messages
        //throw new IllegalArgumentException("Invalid input!");
    }
}
