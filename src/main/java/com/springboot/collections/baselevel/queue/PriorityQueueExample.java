package com.springboot.collections.baselevel.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author prabhakar, @Date 10-09-2024
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Rajendra");
        queue.add("Mahindra");
        queue.add("Raja");
        queue.add("Sudha");
        queue.add("Rahul");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
