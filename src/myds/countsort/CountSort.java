package myds.countsort;

public class CountSort {
	private int k;
	private int[] arr;
	
	public CountSort(int k, int[] arr) {
		this.k = k;
		this.arr = arr;
	}
	
	public void calcFrequency(int[] mem, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			mem[arr[i]]++;
		}
	}
	
	public void aggregateFrequency(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}
	}
	
	public void positionElements(int[] arr, int[] mem, int[] result) {
		for(int i = arr.length - 1; i >= 0 ; i--) {
			result[mem[arr[i]] - 1] = arr[i];
			mem[arr[i]]--;
		}
	}
	
	public int[] sort() {
		int[] result = new int[this.arr.length];
		int[] mem = new int[k + 1];
		
		calcFrequency(mem, this.arr);
		aggregateFrequency(mem);
		positionElements(this.arr, mem, result);
		
		return result;
	}
}
