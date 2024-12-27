package com.springboot.thread.demo;

/**
 * @author prabhakar, @Date 07-08-2024
 */
public class Threading extends Thread{

    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) throws InterruptedException {
        Threading t1 = new Threading();
        t1.run();
        t1.start();
        Thread.sleep(1000);
        Thread.currentThread().start();
    }
}
