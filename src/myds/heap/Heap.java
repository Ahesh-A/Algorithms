package myds.heap;
import java.util.List;
import java.util.ArrayList;

import mydsI.Heapable;

public class Heap<T> implements Heapable<T>{
	private List<T> arr;	
	
	Heap() {
		this.arr = new ArrayList<T>();
	}
	
	public T getRoot() {
		return arr.get(0);
	}
	
	protected List<T> getHeap() {
		return this.arr;
	}
	
}
