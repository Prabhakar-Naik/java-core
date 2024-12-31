package com.springboot.thread.multithreads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class VolatileCounter {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increment(){
        counter.incrementAndGet();
    }

    public int getCounter(){
        return this.counter.get();
    }


    public static void main(String[] args) throws InterruptedException {
        VolatileCounter volatileCounter = new VolatileCounter();
        Thread thread = new Thread(() -> {
            for (int i=0;i<1000; i++){
                volatileCounter.increment();
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i=0; i< 1000; i++){
                volatileCounter.increment();
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(volatileCounter.getCounter());
    }
}
