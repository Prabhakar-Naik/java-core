package com.springboot.thread.multithreads.lockings.intrinsic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class Account {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();


    // intrinsic process for critical section auto assign with synchronized keyword
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " Processing with withdrawal");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance.");
        }

    }


    public void balanceWithdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            //lock.lock();
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Processing with withdrawal");
                        Thread.sleep(3000);     // Simulate time taken to process the withdrawal.
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining Balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance.");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }

        if (Thread.currentThread().isInterrupted()){
            System.out.println("");
        }
    }


}
