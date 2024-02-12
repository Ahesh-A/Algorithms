package myds.heap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import mydsI.Heapable;

public class Heap<T extends Comparable<T>> implements Heapable<T>{
	private List<T> arr;	
	private int size;
	
	Heap() {
		this.arr = new ArrayList<T>();
	}
	Heap(T[] arr) {
		this.arr = new ArrayList<T>(Arrays.asList(arr));
		this.size = arr.length;
	}
	
	public T getRoot() {
		return arr.get(0);
	}
	
	protected List<T> getHeap() {
		return this.arr.subList(0, this.size);
	}
	
	protected int getSize() {
		return this.size;
	}
	
	protected void setSize(int size) throws Exception {
		if(size < 0) throw new Exception("Heap size should be a non-negative value");
		
		this.size = size;
	}
}
