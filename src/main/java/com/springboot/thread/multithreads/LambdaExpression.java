package com.springboot.thread.multithreads;

/**
 * @author prabhakar, @Date 28-12-2024
 */
public class LambdaExpression {

    public static void main(String[] args) {

        System.out.println("Different Types of Functions which is comes under lambda expression.");
        // Formal
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is formal implementation of runnable instance function.");
            }
        };

        Thread normal = new Thread(task);
        normal.start();

        // Lambda function complete function
        Runnable task1 = () -> {
            System.out.println("Lambda function complete function");
        };
        Thread advance = new Thread(task1);
        advance.start();

        Runnable task2 = () -> System.out.println("More difficult and exclusive single line.");
        Thread moreAdv = new Thread(task2);
        moreAdv.start();

        Thread thread = new Thread(() -> System.out.println("This is ultimate function"));
        thread.start();

        Thread thread1 = new Thread(() ->{
            for (int i=1;i<=5;i++)
                System.out.println("Running: "+i);
        });
        thread1.start();


    }
}
