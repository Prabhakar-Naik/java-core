package com.springboot.lambda;

/**
 * @author prabhakar, @Date 04-09-2024
 */
public class LambdaExample implements Display {

    public static void main(String[] args) {

        LambdaExample obj=new LambdaExample();
        obj.display("Welcome to Java , Lambda Expression by Prabhakar...");

    }

    @Override
    public void display(String msg) {
        System.out.println(msg);
    }
}
