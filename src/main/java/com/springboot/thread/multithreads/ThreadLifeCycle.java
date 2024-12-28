package com.springboot.thread.multithreads;

/**
 * @author prabhakar, @Date 27-12-2024
 */
public class ThreadLifeCycle extends Thread{

    /*
    Thread Life Cycle:
        ==> The Life Cycle of thread in java consists of several states, which a thread can
            move through during its execution.
        ==> 1. New      2. Runnable       3. Running     4. Blocking/Waiting    5. Terminated

        New     : A thread is in this state when it is created but not yet started.
        Runnable: After the start method is called, the thread becomes runnable.
                  It's ready to run and waiting for CPU time
        Running : The thread is in state when it is executing
        Blocking/Waiting : A thread is in this state when it is waiting for a resource or
                           for another thread to perform action.
        Terminated : A thread is in this state when it has finished executing.

     */

    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // methods in thread
    // run(), start(), sleep(), join(), priority(), interrupt(), yield()
    public static void main(String[] args) {

        ThreadLifeCycle thread = new ThreadLifeCycle();
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread.getState());

    }



}
