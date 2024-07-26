package com.springboot.core.determines;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 25-07-2024
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        float temperatue;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperatue = in.nextInt();

        temperatue = ((temperatue - 32)*5)/9;

        System.out.println("Temperature in Celsius = " + temperatue);
    }
}
