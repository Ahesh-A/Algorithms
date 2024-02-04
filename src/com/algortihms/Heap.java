package com.algorithms;

public class Heap {
    private int[] heap;

    Heap(int heapSize) {
        this.heap = new int[heapSize];
    }

    Heap(int heapSize, int[] arr) throws Exception{
        this.heap = new int[heapSize];

        if(heapSize < arr.length) {
            throw new Exception("array length greater than the heap size");
        }

        deepCopy(heap, arr);
    }

    private void deepCopy(int[] heap, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            heap[i] = arr[i];
        }
    }
    

}