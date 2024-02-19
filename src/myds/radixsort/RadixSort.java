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
	
	public int getMapping(int num, int factor) {
		
		return (num / factor) % 10;
	}
	
	public void radixSort(int[] arr) {
		
		Queue<Queue<Integer>> queue = getEmptyList();
		int numberLength = getNumberLength(Arrays.stream(arr).max().getAsInt());
		
		System.out.println(getMapping(3, 1));
	}
	
	public void sort(int[] arr) {
		radixSort(arr);
		return;
	}
}
