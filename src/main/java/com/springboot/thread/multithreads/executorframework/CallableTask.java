package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.*;

/**
 * @author prabhakar, @Date 29-12-2024
 */
public class CallableTask implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        Callable<?> callable = () -> "HELLO It's Callable.";
        Future<?> obj = executorService.submit(callable);

        System.out.println(obj.get());

        if (obj.isDone()){
            System.out.println("Task is Done.");
        }

        executorService.shutdown();

    }
}
