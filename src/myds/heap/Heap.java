package myds.heap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import mydsI.Heapable;

public class Heap<T> implements Heapable<T>{
	private List<T> arr;	
	
	Heap() {
		this.arr = new ArrayList<T>();
	}
	Heap(T[] arr) {
		this.arr = new ArrayList<T>(Arrays.asList(arr));
	}
	
	public T getRoot() {
		return arr.get(0);
	}
	
	protected List<T> getHeap() {
		return this.arr;
	}
	
}
