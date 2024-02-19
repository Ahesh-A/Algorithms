package myds.stoogesort;

public class StoogeSort {
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void stoogeSort(int[] arr, int start, int end) {
		
		if(arr[start] > arr[end]) swap(arr, start, end);
		
		if(start + 1 >= end) return;
		
		int k = (end - start + 1) / 3;
		
		stoogeSort(arr, start, end - k);
		stoogeSort(arr, start + k, end);
		stoogeSort(arr, start, end - k);
	}
	
	public static void sort(int[] arr) {
		stoogeSort(arr, 0, arr.length - 1);
		return;
	}
}
