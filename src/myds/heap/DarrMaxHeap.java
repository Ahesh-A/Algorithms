package myds.heap;

import java.util.List;

public class DarrMaxHeap<T extends Comparable<T>> extends Heap<T>{
	private final int d;
	
	public DarrMaxHeap(int d) {
		this.d = d;
	}
	
	public DarrMaxHeap(T[] arr, int d) {
		super(arr);
		this.d = d;
//		buildMaxHeap(super.getHeap());
	}
	
	private void swap(List<T>list, int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	
	
}
