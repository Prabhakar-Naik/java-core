package com.springboot.thread.multithreads.lockings.explicit;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author prabhakar, @Date 28-12-2024
 */
public class ReentrantExample {

    //methods
    // lock, lock(), tryLock(), tryLock(1000, TimeUnit.MILLISECONDS), unlock(),deadlock automatic,
    //  lockInterruptibly() example not required,

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();        // deadlock prevention automatically
        try {
            System.out.println("Inner Method");

        }finally {
            lock.unlock();  // returns 0
            //lock.unlock();  //IllegalMonitorStateException // returns -1
        }
    }

    public static void main(String[] args) {

        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
