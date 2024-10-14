package com.springboot.core.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 11-10-2024
 */
public class TwoMaxHeap {

    private List<Integer> heap;
    private int maxChild;

    public TwoMaxHeap(int maxChild) {
        this.maxChild = maxChild;
        this.heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        siftUp(heap.size() - 1);
    }

    public int popMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }

        int max = heap.get(0);
        int lastIdx = heap.size() - 1;
        heap.set(0, heap.get(lastIdx));
        heap.remove(lastIdx);
        siftDown(0);

        return max;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) >> maxChild; // Right shift is equivalent to division by 2^maxChildrenPower
            if (heap.get(parentIndex) >= heap.get(index)) {
                break; // Heap property is satisfied
            }
            swap(parentIndex, index);
            index = parentIndex;
        }
    }

    private void siftDown(int index) {
        while ((index << maxChild) + 1 < heap.size()) { // Left shift is equivalent to multiplication by 2^maxChildrenPower
            int leftChildIndex = (index << maxChild) + 1;
            int rightChildIndex = Math.min(leftChildIndex + (1 << maxChild), heap.size()) - 1;
            int largestChildIndex = findLargestChildIndex(index, leftChildIndex, rightChildIndex);

            if (heap.get(index) >= heap.get(largestChildIndex)) {
                break; // Heap property is satisfied
            }
            swap(index, largestChildIndex);
            index = largestChildIndex;
        }
    }

    private int findLargestChildIndex(int parentIdx, int leftChildIdx, int rightChildIdx) {
        int largestIdx = leftChildIdx;
        for (int i = leftChildIdx + 1; i <= rightChildIdx; i++) {
            if (heap.get(i) > heap.get(largestIdx)) {
                largestIdx = i;
            }
        }
        return largestIdx;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }
}

