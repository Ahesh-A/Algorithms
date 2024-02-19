package myds.radixsort;

import java.util.Arrays;
import java.util.HashMap;


public class RadixSort {
	
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
	
	public int[] generateFrequencyMap(int[] arr, int factor) {
		int[] result = new int[arr.length];
		
		for(int i : arr) {
			result[getMapping(i, factor)] ++;
		}
		
		return result;
	}
	
	public void getCumulativeSum(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		
		return;
	}
	
	public int[] sortOnFactor(int[] arr, int factor) {
		
		int[] result = new int[arr.length];
		int[] frequencyMap = generateFrequencyMap(arr, factor);
		getCumulativeSum(arr);
		
		
		return result;
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
