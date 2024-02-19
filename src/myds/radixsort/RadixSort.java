package myds.radixsort;

import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
	
	public Queue<Queue<Integer>> getEmptyList() {
		Queue<Queue<Integer>> queue = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			queue.offer(new LinkedList<>());
		}
		
		return queue;
	}
	
	public void radixSort(int[] arr) {
		
		Queue<Queue<Integer>> queue = getEmptyList();
		System.out.println(queue);
		
		
	}
	
	public void sort(int[] arr) {
		radixSort(arr);
		return;
	}
}
