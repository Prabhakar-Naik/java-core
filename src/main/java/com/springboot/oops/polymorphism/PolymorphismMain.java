package com.springboot.oops.polymorphism;

/**
 * @author prabhakar, @Date 25-06-2024
 */
public class PolymorphismMain {

    public static void main(String[] args) {

        MethodOverriding methodOverriding = new MethodOverriding();
        System.out.println("add two numbers: "+methodOverriding.add(10,20));
        System.out.println("add three numbers: "+methodOverriding.add(10,20,30));
        System.out.println("add four numbers: "+methodOverriding.add(10,20,30,40));
        System.out.println("add your numbers: "+methodOverriding.add(1,2,3,4,5,6,7,8,9,10));

        System.out.println("sub two numbers: "+methodOverriding.sub(20,5));
        System.out.println("sub one in add of two numbers: "+methodOverriding.sub(20,10,8));

    }
}
