package com.springboot.core.patterns;

/**
 * @author prabhakar, @Date 17-12-2024
 */
public class RightAngledTrianglePattern {

    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i=1, j=1; j<=rows; i= i*10, j++){
            System.out.println(i);
        }



    }
}
