package com.springboot.thread.multithreads;

/**
 * @author prabhakar, @Date 28-12-2024
 */

class SharedResource {
    private int data;
    private boolean hasData;


    public synchronized int consume() {
        while (!hasData){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        hasData = false;
        notify();
        System.out.println("Consumed: "+data);
        return data;
    }

    public synchronized void produce(int value){
        while (hasData){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: "+data);
        notify();
    }

}

class Producer implements Runnable {
    private SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);

        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();

        }
    }
}

public class ThreadCommunication {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();

    }
}
