package com.springboot.thread.multithreads.methods;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class StartSleepAndJoin extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is RUNNING......!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

        StartSleepAndJoin thread = new StartSleepAndJoin();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello");


    }

}
