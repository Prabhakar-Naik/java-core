package com.springboot.thread.multithreads.methods;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class StartSleepPriority extends Thread{

    // create a class,
    // extends with Thread
    // The run method is overridden to define the code that constitutes the new thread
    // start method is called to initiate the new thread.
    @Override
    public void run() {
        System.out.println("Projector started....!");
        for (int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName()+ " - Priority: "+
                    Thread.currentThread().getPriority()+ " - Count: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public StartSleepPriority(String name){
        super(name);
    }

    public static void main(String[] args) {

        StartSleepPriority priorities = new StartSleepPriority("Prabhakar");
        priorities.setPriority(MIN_PRIORITY);
        priorities.start();

        StartSleepPriority low = new StartSleepPriority("Lower Priority Thread");
        StartSleepPriority mid = new StartSleepPriority("Mid Priority Thread");
        StartSleepPriority high = new StartSleepPriority("High Priority Thread");
        low.setPriority(Thread.MIN_PRIORITY);
        mid.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        mid.start();
        high.start();


    }

}
