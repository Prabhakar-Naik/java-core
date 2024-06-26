package com.springboot.oops.inheritance.multiple;

/**
 * @author prabhakar, @Date 26-06-2024
 */
public class MainImplementation implements Calc,CalcDescribe{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public int module(int a, int b) {
        return a % b;
    }

    @Override
    public String add() {
        return "addition of given: ";
    }

    @Override
    public String sub() {
        return "subtraction of given: ";
    }

    @Override
    public String multiply() {
        return "multiplication of given: ";
    }

    @Override
    public String division() {
        return "Division of given: ";
    }

    @Override
    public String module() {
        return "Remainder of given: ";
    }

    // we can not achieve the multiple inheritance in java using classes
    // we can achieve this using interfaces

    public static void main(String[] args) {

        MainImplementation main = new MainImplementation();

        System.out.println(main.add()+main.add(10,20));
        System.out.println(main.sub()+main.sub(24,7));
        System.out.println(main.multiply()+main.multiply(4,5));
        System.out.println(main.division()+main.division(34,6));
        System.out.println(main.module()+main.module(32,8));

    }

}
