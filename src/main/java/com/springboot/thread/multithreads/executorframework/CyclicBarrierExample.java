package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.CyclicBarrier;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class CyclicBarrierExample {

    public static void main(String[] args) {

        int numberOfSubsystems = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(numberOfSubsystems, new Runnable() {
            @Override
            public void run() {
                System.out.println("All sub systems are up and running. System startup complete.");
            }
        });

        Thread webServerThread = new Thread(new Subsystem("Web Server",2000,cyclicBarrier));
        Thread databaseThread = new Thread(new Subsystem("Database",4000,cyclicBarrier));
        Thread cachedThread = new Thread(new Subsystem("Cache",3000,cyclicBarrier));
        Thread messagingServiceThread = new Thread(new Subsystem("Messaging Service",3500,cyclicBarrier));

        webServerThread.start();
        databaseThread.start();
        cachedThread.start();
        messagingServiceThread.start();


    }

}

class Subsystem implements Runnable{

    private String name;
    private int initializationTime;

    private CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(name+" initialization started.");
            Thread.sleep(initializationTime);       // simulate time taken to initialize
            System.out.println(name+" initialization complete.");
            barrier.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
