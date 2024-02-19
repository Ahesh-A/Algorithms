package myds.radixsort;

import java.util.Arrays;
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
	
	public int getNumberLength(int number) {
		int result = 0;
		
		while(number != 0) {
			number /= 10;
			result++;
		}
		
		return result;
	}
	
	public void radixSort(int[] arr) {
		
		Queue<Queue<Integer>> queue = getEmptyList();
		int numberLength = getNumberLength(Arrays.stream(arr).max().getAsInt());
		
		System.out.println(numberLength);
	}
	
	public void sort(int[] arr) {
		radixSort(arr);
		return;
	}
}
