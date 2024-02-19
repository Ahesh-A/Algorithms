package myds.radixsort;

import java.util.Arrays;
import java.util.HashMap;
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
	
	public void putElementToMap(HashMap<Integer, Integer> map, int value) {
		if(!map.containsKey(value)) {
			map.put(value, 1);
			return;
		}
		
		map.put(value, map.get(value) + 1);
	}
	
	public HashMap<Integer, Integer> generateFrequencyMap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : arr) {
			putElementToMap(map, i);
		}
		
		return map;
	}
	
	public void sortOnFActor(int[] arr, int factor) {
		Queue<Queue<Integer>> queue = getEmptyList();
		
		HashMap<Integer, Integer> frequencyMap = generateFrequencyMap(arr);
		
	}
	
	public void radixSort(int[] arr) {
		
		int numberLength = getNumberLength(Arrays.stream(arr).max().getAsInt());
		int factor = 1;
		
		for(int i = 0; i < numberLength; i++) {
			
		}
		
	}
	
	public void sort(int[] arr) {
		radixSort(arr);
		return;
	}
}
