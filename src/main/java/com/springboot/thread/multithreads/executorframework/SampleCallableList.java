package com.springboot.thread.multithreads.executorframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author prabhakar, @Date 29-12-2024
 */
public class SampleCallableList {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Callable<Integer>> list = getCallables();

        try {
            List<Future<Integer>> integerFuture = executorService.invokeAll(list);
            Integer one = executorService.invokeAny(list);
            System.out.println("This is invokeAny(): "+one);

            System.out.println("is ShutDown: "+executorService.isShutdown());
            System.out.println("is Terminated: "+executorService.isTerminated());

           for (Future<?> future: integerFuture){
               System.out.println("Get Data: "+future.get());
               System.out.println("is Done: "+future.isDone());
               System.out.println("is Cancelled: "+future.isCancelled());
           }



        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }

    private static List<Callable<Integer>> getCallables() {
        Callable<Integer> callable1 = () ->{
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 10;
        };
        Callable<Integer> callable2 = () ->{
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 20;
        };
        Callable<Integer> callable3 = () ->{
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 30;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
        return list;
    }
}
