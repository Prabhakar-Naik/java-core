package com.springboot.thread.demo;

/**
 * @author prabhakar, @Date 07-08-2024
 */
public class TestJoinThreadMethod extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){System.out.println(e.getMessage());}
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        TestJoinThreadMethod t1=new TestJoinThreadMethod();
        TestJoinThreadMethod t2=new TestJoinThreadMethod();
        TestJoinThreadMethod t3=new TestJoinThreadMethod();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e.getMessage());}

        t2.start();
        t3.start();
    }
}
