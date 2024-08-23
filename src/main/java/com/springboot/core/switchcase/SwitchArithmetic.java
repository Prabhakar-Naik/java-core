package com.springboot.core.switchcase;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 23-08-2024
 */
public class SwitchArithmetic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2=sc.nextInt();

        System.out.println("Enter your operation on given numbers: ");
        System.out.println("Choose one +, -, *, /, % ");
        String ch=sc.next();

        switch(ch) {
            case "+":{
                System.out.println("Addition of Given Numbers: "+(num1+num2));
                break;
            }
            case "-":{
                System.out.println("Substraction of Given Numbers: "+(num1-num2));
                break;
            }
            case "*":{
                System.out.println("Product of Given Numbers: "+(num1*num2));
                break;
            }
            case "/":{
                System.out.println("Devision of Given Numbers: "+(num1/num2));
                break;
            }
            case "%":{
                System.out.println("Remainder of Given Numbers: "+(num1%num2));
                break;
            }
            default:{
                System.out.println("Choose Valid Operation on Numbers: ");
                System.out.println("Try Again Later....!");
                break;
            }
        }

        sc.close();

    }
}
