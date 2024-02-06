package algorithm;

import myds.heap.MaxHeap;

public class Main {
	public static void main(String[] args) {
		try {
			MaxHeap<Integer> maxHeap = new MaxHeap<>();
			maxHeap.maxHeapify(10);
		} catch (Exception e) {
			System.out.print("Error");
		}
	
	}
}
