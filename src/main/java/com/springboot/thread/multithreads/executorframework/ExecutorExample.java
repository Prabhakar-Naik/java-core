package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class ExecutorExample {

    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(2);
                                          Executors.newSingleThreadExecutor();
                                          // it has only one thread
                                          //Executors.newWorkStealingPool();

                                          Executors.newFixedThreadPool(2);
                                          // we are declaring fixed threads in a pool
        ExecutorService executorService = Executors.newCachedThreadPool();
        // newCachedThreadPool responsibility is a thread require for any other functionality
        // it stores the thread in cashed area.

        executor.execute(() -> System.out.println("Executor"));

        // we manually stop the server this is the main problem or dis-advantage
    }
}
