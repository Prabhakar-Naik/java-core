package com.springboot.core.switchcase;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 23-08-2024
 */
public class SwitchWeekGDays {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Day: ");

        String day=sc.next();

        switch(day) {
            case "monday":{
                System.out.println("Hey monday id week day. Joy the day...");
                break;
            }
            case "tuesday":{
                System.out.println("Hey tuesday id week day. Joy the day...");
                break;
            }
            case "wednesday":{
                System.out.println("Hey wednesday id week day. Joy the day...");
                break;
            }
            case "thursday":{
                System.out.println("Hey thursday id week day. Joy the day...");
                break;
            }
            case "friday":{
                System.out.println("Hey friday id week day. Joy the day...");
                break;
            }
            case "saturday", "sunday":{
                System.out.println("Hey yes It's weekend Joy the day...");
                break;
            }
            default:{
                System.out.println("Your Entering Wrong day please correct it once come again Thank you.");
                break;
            }
        }
        sc.close();
    }
}
