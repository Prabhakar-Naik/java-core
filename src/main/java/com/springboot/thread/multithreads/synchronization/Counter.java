package com.springboot.thread.multithreads.synchronization;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class Counter {

    private int count=0;

    // Critical section
//    public synchronized void setCount(){
//        count++;
//    }     // or

    // if we don't use the synchronization that is called as
    // race condition or critical section or mutual exclusion
    // results are un predictable
    public void increment(){
        synchronized (this) {
            count++;
        }
    }

    public int getCount(){
        return count;
    }


}
