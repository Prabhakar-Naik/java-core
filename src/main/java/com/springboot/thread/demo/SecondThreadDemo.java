package com.springboot.thread.demo;

import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 11-10-2024
 */
public class SecondThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("This is run method...SecondThreadDemo class.");
    }

    public static void main(String[] args) throws InterruptedException {
        SecondThreadDemo p=new SecondThreadDemo();
        p.run();
        Thread.sleep(1000);
        SampleApplication app =new SampleApplication();
        app.start();
        SampleApplication.printEven();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread());
        SampleApplication.PrintOdd();
    }
}

class SampleApplication extends Thread implements Runnable{
    public void run()
    {
        System.out.println("This is run method....SampleApplication class.");

    }

    public static void printEven() {

        System.out.println("This is SecondThreadDemo method... in SampleApplication class.");
        IntStream.range(1, 100).filter(n ->n%2==0).forEach(n -> System.out.print(n+"  "));

        System.out.println();
    }

    public static void PrintOdd() {
        System.out.println("This is SecondThreadDemo Odd Method...in SampleApplication class.");
        IntStream.range(1,100).filter(n ->n%2==1).forEach(n ->System.out.print(n+"  "));

    }
}