package com.springboot.thread.multithreads.methods;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class StartAndYield extends Thread{

    StartAndYield(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() +" is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        StartAndYield thread = new StartAndYield("t1");
        StartAndYield thread1 = new StartAndYield("t2");

        thread.start();
        thread1.start();


    }


}
