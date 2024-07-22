package com.springboot.core.ternary;

/**
 * @author prabhakar, @Date 12-07-2024
 */
public class TernaryOperator {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 63;
        int num3 = 45;

        // normal conditions
        if (num1 > num2)
            System.out.println(num1+" Big Value");
        else if (num2 > num3)
            System.out.println(num2+" Big Value");
        else
            System.out.println(num3+" Big Value");


        // using ternary operator

        var max = (num1 > num2) ? num1 : (num2 > num3) ? num2 : num3;
        System.out.println(max+" Big Value");

        max = (num1 > num2) ? num1 : Math.max(num2, num3);
        System.out.println(max+" Big Value");

        System.out.println(ternary(num1,num2,num3));

    }

    private static String ternary(int num1, int num2, int num3){
         return num1 > num2 ? num1+" is Big":(num2 > num3) ? num2+" is Big": num3+" is Big";
    }
}
