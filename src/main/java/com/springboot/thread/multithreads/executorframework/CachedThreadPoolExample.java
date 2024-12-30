package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.*;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class CachedThreadPoolExample {


    public static void main(String[] args) {

        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        // for reuse of countdown we can go with CycleBarrier but not CountDownLatch
        CyclicBarrier cyclicBarrier = new CyclicBarrier(numberOfServices);


        // using callable dependent implementation
        /*
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main");
        executorService.shutdown();
        */

        // using runnable dependent implementation
        /*
        for (int i=0; i < numberOfServices; i++){
            new Thread(new RunnableDependentService(latch)).start();
        }
        try {
            //latch.await();
            latch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main");
        */

        // using cyclicBarrier implementation

        executorService.submit(new DependentService(cyclicBarrier));
        executorService.submit(new DependentService(cyclicBarrier));
        executorService.submit(new DependentService(cyclicBarrier));
        System.out.println("Main");
        final var numberWaiting = cyclicBarrier.getNumberWaiting();
        System.out.println(numberWaiting);
        executorService.shutdown();

    }
}

//class DependentService implements Callable<Object> {
//
//    private final CountDownLatch latch;
//
//    DependentService(CountDownLatch latch) {
//        this.latch = latch;
//    }
//
//    @Override
//    public Object call() throws Exception {
//        try {
//            System.out.println(Thread.currentThread().getName()+ " service started.!");
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }finally {
//            latch.countDown();
//        }
//        return "OK";
//    }
//
//}

class DependentService implements Callable<Object> {
    private final CyclicBarrier barrier;

    DependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.!");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting for barrier.");
        barrier.await();
        return "Ok";
    }
}

//class RunnableDependentService implements Runnable{
//    private final CountDownLatch latch;
//
//    RunnableDependentService(CountDownLatch latch) {
//        this.latch = latch;
//    }
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(6000);
//            System.out.println(Thread.currentThread().getName()+ " service started.!");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }finally {
//            latch.countDown();
//        }
//    }
//}
