package com.springboot.thread.multithreads.lockings.intrinsic;

/**
 * @author prabhakar, @Date 28-12-2024
 */
public class IntrinsicMainAccount {

    public static void main(String[] args) {

        Account account = new Account();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                account.withdraw(50);
            }
        };

        Thread thread = new Thread(task,"Thread 1");
        Thread thread1 = new Thread(task,"Thread 2");
        Thread thread2 = new Thread(task,"Thread 3");
        thread.start();
        thread1.start();
        thread2.start();


    }

}
