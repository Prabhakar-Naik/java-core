package com.springboot.core.largest;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 26-07-2024
 */
public class LargestOfThreeNumbers {

    public static void main(String[] args)
    {
        int first, second, third;
        System.out.println("Enter three integers ");
        Scanner in = new Scanner(System.in);

        first = in.nextInt();
        second = in.nextInt();
        third = in.nextInt();

        if ( first > second && first > third )
            System.out.println("First number is largest. "+first);
        else if ( second > first && second > third )
            System.out.println("Second number is largest. "+second);
        else if ( third > first && third > second )
            System.out.println("Third number is largest. "+third);
        else
            System.out.println("Entered numbers are not distinct.");
    }
}
