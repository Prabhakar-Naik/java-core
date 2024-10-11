package com.springboot.thread;

/**
 * @author prabhakar, @Date 11-10-2024
 */
public class ThirdDemo implements Runnable{
    @Override
    public void run() {

        System.out.println("Prime Numbers: ");

        for(int i=1;i<=100;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.print(i+"  ");

            count=0;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("invoke run() method in Thread super class: ");
        ThirdDemo t=new ThirdDemo();
        t.run();
        System.out.println("invoke start() method with the help of object reference: ");
        Thread obj=new Thread(t);
        obj.start();
    }
}
