package com.springboot.oops.abstraction;

import java.util.List;

/**
 * @author prabhakar, @Date 24-06-2024
 */

public class Abstraction {
    // Abstraction

    public int add(int num1, int num2){
        return (num1+num2);
    }

    public int sub(int num1, int num2){
        return (num1 - num2);
    }

    public int product(int num1, int num2){
        return (num1 * num2);
    }

    public double division(int num1, int num2){
        return ((double) num1 / num2);
    }

    public int arraySum(int ...args){
        int total = 0;
        for (int arg : args) total += arg;

        return total;
    }

    public int listSum(List<Integer> list){
        int total = 0;
        for (int i: list)
            total += i;

        return total;
    }


    public void calc(){
        
    }


}
