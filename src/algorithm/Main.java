package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import myds.heap.MaxHeap;

public class Main {
	public static void main(String[] args) {
		Integer[] arr =  {16, 10, 14, 8, 9, 4, 2, 7, 3, 1};
//		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//		list.set(list.size(), 0);
//		System.out.println("List: " + list);
		
		MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(arr);
		
		try {
//			System.out.println("Heap: " + maxHeap.getHeap());
			maxHeap.maxHeapInsert(19);
			System.out.println("Heap: " + maxHeap.getHeap());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Error");
		}
	}
}
