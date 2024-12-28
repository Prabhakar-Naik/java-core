package com.springboot.thread.multithreads.methods;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class StartAndInterrupted extends Thread{

    public StartAndInterrupted(String name){
        super(name);
    }

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Thread is Running...!");
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception: "+e );
        }
    }


    public static void main(String[] args) {

        StartAndInterrupted thread = new StartAndInterrupted("MyThread");
        StartAndInterrupted thread1 = new StartAndInterrupted("MyThread1");
        thread.start();
        thread1.start();
        //thread.interrupt();
    }
}
