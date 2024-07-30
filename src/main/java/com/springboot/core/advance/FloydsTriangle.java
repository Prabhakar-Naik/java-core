package com.springboot.core.advance;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 30-07-2024
 */
public class FloydsTriangle {

    public static void main(String[] args) {

        int number, num = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows of floyd's triangle you want");
                number = in.nextInt();

        System.out.println("Floyd's triangle :-");

        for (int i = 1 ; i <= number ; i++ )
        {
            for (int j = 1 ; j <= i ; j++ )
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
