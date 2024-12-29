package com.springboot.thread.multithreads.lockings.explicit;

import com.springboot.thread.multithreads.lockings.intrinsic.Account;

/**
 * @author prabhakar, @Date 28-12-2024
 */
public class ExplicitMainAccount {

    public static void main(String[] args) {

        Account account = new Account();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                account.balanceWithdraw(50);
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
