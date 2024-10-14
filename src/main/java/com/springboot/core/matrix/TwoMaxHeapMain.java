package com.springboot.core.matrix;

/**
 * @author prabhakar, @Date 11-10-2024
 */
public class TwoMaxHeapMain {

    public static void main(String[] args) {
        testHeapWithX(1);
        testHeapWithX(3);
        testEdgeCase();
    }

    private static void testHeapWithX(int x) {
        System.out.println("Testing heap with x = " + x);
        TwoMaxHeap heap = new TwoMaxHeap(x);

        // Insert elements
        heap.insert(10);
        heap.insert(5);
        heap.insert(15);
        heap.insert(20);
        heap.insert(8);

        // Pop max elements
        while (!heap.isEmpty()) {
            System.out.println("Max element: " + heap.popMax());
        }

        System.out.println();
    }

    private static void testEdgeCase() {
        System.out.println("Testing edge case with very large value of x");
        int x = 10; // A very large value of x
        TwoMaxHeap heap = new TwoMaxHeap(x);

        // Insert elements
        for (int i = 1; i <= 1000; i++) {
            heap.insert(i);
        }

        // Pop max elements
        while (!heap.isEmpty()) {
            heap.popMax();
        }

        System.out.println("Edge case test completed.\n");
    }
}
