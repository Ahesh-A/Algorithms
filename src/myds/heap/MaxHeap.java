package myds.heap;

import java.util.List;

public class MaxHeap<T extends Comparable<T> > extends Heap<T>{
	public MaxHeap() {
		super();
	}
	
	public MaxHeap(T[] arr) {
		super(arr);
	}
	
	private void swap(List<T>list, int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	private void maxHeapify(int i, List<T> arr) {
		
		int length = super.getSize();
		
		if(i > 2 * length + 1) return;
		
		int left = 2 * i + 1;
		int right  = 2 * (i + 1);
		int target = i;
		
		if(
			left < length && 
			arr.get(left).compareTo(arr.get(target)) > 0
		) {
			target = left;
			
		}
		
		if(
			right < length && 
			arr.get(right).compareTo(arr.get(target)) > 0
		) {
			target = right;
		}
		
		if(target != i) {
			swap(arr, i, target);
			maxHeapify(target, arr);
		}
	}
	
	public void buildMaxHeap(List<T> arr) {
		int length = super.getSize();
		for(int i = length / 2 - 1; i >= 0; i--) {
			maxHeapify(i, arr);
		}
	}
}
