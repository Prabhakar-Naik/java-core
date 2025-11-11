package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}

public class OverloadingHere {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2 integers: "+calculator.add(2,3));
        System.out.println("2 doubles: "+calculator.add(2.0,3.0));
        System.out.println("3 integers: "+calculator.add(2,3,5));
    }
}
