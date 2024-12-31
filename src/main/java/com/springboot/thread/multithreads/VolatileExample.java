package com.springboot.thread.multithreads;

/**
 * @author prabhakar, @Date 30-12-2024
 */

class SharedObject{
    private volatile boolean flag = false;

    public void setFlag(){
        System.out.println("Flag id true now !");
        this.flag = true;
    }

    public void printIfFlagTrue(){
        while (!flag){
            // do nothing
        }
        System.out.println("Flag is true !");
    }

}
public class VolatileExample {

    public static void main(String[] args) {

        SharedObject object = new SharedObject();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            object.setFlag();
        });

        Thread readerThread = new Thread(() -> {
            object.printIfFlagTrue();
        });

        writerThread.start();
        readerThread.start();

    }
}


