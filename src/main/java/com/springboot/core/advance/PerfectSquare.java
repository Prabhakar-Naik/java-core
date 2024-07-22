package com.springboot.core.advance;

/**
 * @author prabhakar, @Date 12-07-2024
 */
public class PerfectSquare {

    public static void main(String[] args) {


        perfectSquare(16);

        int num = 324; // Replace with your desired number
        double sqrt = Math.sqrt(num);
        double floorSqrt = Math.floor(sqrt);
        double diff = sqrt - floorSqrt;
        if (diff == 0) {
            System.out.println(sqrt+ " is a perfect square. for "+num);
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }

    public static void perfectSquare(int num){
        //int num = 100; // Replace with your desired number 2,9,16,25,36,49,64,81,100, ect 324
        for (int i = 1; i < num; i++) {
            if ((num % i == 0) && (num / i == i)) {
                System.out.println(i + " is a perfect square. for "+num);
            }
        }
    }


}
