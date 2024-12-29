package com.springboot.thread.multithreads.lockings.deadlock;

/**
 * @author prabhakar, @Date 28-12-2024
 */

class Paper{

    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+ " is using pen "+ this+ " and trying to use pen " + pen);
        pen.finishWriting();
    }
    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen "+ this);
    }

}
class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+ " is using pen "+ this+ " and trying to use pen " + paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen "+ this);
    }
}

//Tasks

class Task1 implements Runnable {
    private  Pen pen;
    private  Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}

class Task2 implements Runnable {
    private  Pen pen;
    private  Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen){
            paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen
        }
    }
}

// Main Thread

public class DeadlockExample {

//    A deadlock occurs in concurrent programming when two or more threads are blocked forever,
//    each waiting for the other to release a resource. This typically happens when threads hold
//    locks on resources and request additional locks held by other threads. For example,
//    Thread A holds Lock 1 and waits for Lock 2, while Thread B holds Lock 2 and waits for Lock 1.
//    Since neither thread can proceed, they remain stuck in a deadlock state.
//    Deadlocks can severely impact system performance and are challenging to debug and resolve
//    in multi_threaded applications.

    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();

    }

}



