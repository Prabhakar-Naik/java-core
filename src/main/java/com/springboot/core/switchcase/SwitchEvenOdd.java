package com.springboot.core.switchcase;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 23-08-2024
 */
public class SwitchEvenOdd {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        switch(n%2) {

            case 0:{
                System.out.println(n+" is Even Number ");
                break;
            }
            case 1:{
                System.out.println(n+" is Not Even number ");
                break;
            }
            default:{
                System.out.println("default: ");
                break;
            }

        }
        sc.close();
    }
}
