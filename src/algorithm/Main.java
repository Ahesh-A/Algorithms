package algorithm;

import myds.heap.MaxHeap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Integer[] arr =  {16, 10, 4, 7, 9, 14, 2, 8, 3, 1};
		MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(arr);
		
		try {
			maxHeap.heapSort();
			System.out.print(maxHeap.getHeap());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Error");
		}
	}
}
