package com.springboot.oops.polymorphism;

/**
 * @author prabhakar, @Date 25-06-2024
 */
public class MethodOverriding extends MethodOverLoading implements Methods{

    @Override
    public int add(int num1, int num2) {
        return super.add(num1, num2);
    }

    @Override
    public int add(int num1, int num2, int num3) {
        return super.add(num1, num2, num3);
    }

    @Override
    public int add(int num1, int num2, int num3, int num4) {
        return super.add(num1, num2, num3, num4);
    }

    @Override
    public int add(int... nums) {
        return super.add(nums);
    }


    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int sub(int num1, int num2, int num3) {
        return (num1+num2) - num3;
    }
}
