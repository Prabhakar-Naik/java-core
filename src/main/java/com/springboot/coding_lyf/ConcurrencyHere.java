package com.springboot.coding_lyf;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author prabhakar, @Date 12-11-2025
 */

public class ConcurrencyHere {

    public static void main(String[] args) {

        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(() -> { for (int i=0;i<100;i++) {
            try {
                q.put(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            try {
                q.put(-1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(() -> { int v; while (true) {
            try {
                if (!((v=q.take()) != -1)) break;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(v);
        }
        });

    }
}
