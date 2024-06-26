package com.springboot.oops.polymorphism;

/**
 * @author prabhakar, @Date 25-06-2024
 */
public class MethodOverLoading {

//    same method name but different parameters within the same class
    public int add(int num1, int num2){
        return (num1+num2);
    }

    public int add(int num1, int num2,int num3){
        return (num1+num2+num3);
    }

    public int add(int num1, int num2, int num3, int num4){
        return (num1+num2+num3+num4);
    }

    public int add(int ...nums){
        int total =0;
        for(int i: nums)
            total += i;
        return total;
    }



}
