package com.springboot.thread.multithreads.synchronization;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class MainCounter {

    public static void main(String[] args) {

        Counter counter = new Counter();

        CounterThread thread = new CounterThread(counter);
        CounterThread thread1 = new CounterThread(counter);

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception: "+e);
        }

        System.out.println(counter.getCount());

    }
}
