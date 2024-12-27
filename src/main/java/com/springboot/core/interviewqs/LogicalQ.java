package com.springboot.core.interviewqs;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class LogicalQ {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.id = 1;
        fun(mobile);
        System.out.println(mobile.id);

        Integer i = 3;
        fun(i);
        System.out.println(i);
    }

    private static void fun(Mobile mobile) {
        Mobile a = new Mobile();
        a.id =4;
        a = mobile;
        //mobile.id = a.id;     1
        //mobile = a;           1
        //mobile.id = 5;        //5
    }

    private static void fun(Integer mobile) {
        mobile = 33;
        //mobile.id = a.id;     1
        //mobile = a;           1
        //mobile.id = 5;        5
    }



    static class Mobile{
        int id;
        String name;
        Mobile(){

        }
    }
}
