package algorithm;

import myds.heap.MaxHeap;

public class Main {
	public static void main(String[] args) {
		Integer[] arr =  {16, 10, 4, 7, 9, 14, 2, 8, 3, 1};
		MaxHeap<Integer> minHeap = new MaxHeap<Integer>(arr);
		
		try {
//			minHeap.heapSort();
//			System.out.println("Heap: " + minHeap.getHeap());
//			System.out.println("Heap size: " + minHeap.getSize());
//			minHeap.resetHeap();
//			System.out.println("Heap: " + minHeap.getHeap());
//			System.out.println("Heap size: " + minHeap.getSize());
//			minHeap.extractRoot();
//			System.out.println("Heap: " + minHeap.getHeap());
//			System.out.println("Heap size: " + minHeap.getSize());
			
			while(minHeap.getSize() != 0) {
				System.out.println(minHeap.extractRoot());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Error");
		}
	}
}
