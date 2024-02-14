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
	
	public int[] sort() {
		int[] result = new int[this.arr.length];
		int[] mem = new int[k + 1];
		
		calcFrequency(mem, mem);
		aggregateFrequency(mem);
		return result;
	}
}
