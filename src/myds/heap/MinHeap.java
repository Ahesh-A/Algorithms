package myds.heap;

import java.util.List;

public class MinHeap<T extends Comparable<T>> extends Heap<T>{
	
	public MinHeap() {
		super();
	}
	
	public MinHeap(T[] arr) {
		super(arr);
		buildMinHeap(super.getHeap());
	}
	
	private void swap(List<T>list, int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	private void minHeapify(int i, List<T> arr) {
		
		int length = super.getSize();
		
		if(i > 2 * length + 1) return;
		
		int left = 2 * i + 1;
		int right  = 2 * (i + 1);
		int target = i;
		
		if(
			left < length && 
			arr.get(left).compareTo(arr.get(target)) < 0
		) {
			target = left;
			
		}
		
		if(
			right < length && 
			arr.get(right).compareTo(arr.get(target)) < 0
		) {
			target = right;
		}
		
		if(target != i) {
			swap(arr, i, target);
			minHeapify(target, arr);
		}
	}
	
	
	public void buildMinHeap(List<T> arr) {
		int length = super.getSize();
		for(int i = length / 2 - 1; i >= 0; i--) {
			minHeapify(i, arr);
		}
	}
	
	public void heapSort() throws Exception{
		List<T> arr = super.getHeap();
		
		buildMinHeap(arr);
		
		while(super.getSize() != 0) {
			int size = super.getSize();
			swap(arr, size - 1, 0);
			super.setSize(size - 1);
			minHeapify(0, arr);
		}
		
	}
	
	public List<T> getHeap() {
		return super.getHeap();
	}
	
	public int getSize() {
		return super.getSize();
	}
	
	public void resetHeap() throws Exception{
		List<T> arr = super.getHeap();
		super.setSize(arr.size());
		buildMinHeap(arr);
	}
	
	public T extractRoot() throws Exception{
		if(super.getSize() == 0) {
			throw new Exception("Heap underflow");
		}
		
		List<T> arr = super.getHeap();
		T result = arr.remove(0);
		super.setSize(arr.size());
		buildMinHeap(arr);
		return result;
	}
	
	private T getParent(List<T>arr, int i) throws Exception{
		if(i == 0) {
			throw new Exception("provoided index has no perent");
		}
		
		return arr.get((i - 1) / 2);
	}
	
	private void insertElement(List<T> arr, int i, T key) throws Exception {
		
		if(i == super.getSize() - 1) {
			arr.add(key);
			return;
		}
		
		if(arr.get(i).compareTo(key) < 0) {
			throw new Exception("The key should be small");
		}
		
		arr.set(i, key);
		
	}
	
	public void heapDecreaseKey(int i, T key) throws Exception{
		List<T> arr = super.getHeap();
		
		insertElement(arr, i, key);
		
		while(i > 0 && getParent(arr, i).compareTo(arr.get(i)) > 0) {
			swap(arr, (i - 1) / 2, i);
			i = (i - 1) / 2;
		}
	}
	
	public void minHeapInsert(T key) throws Exception {
		
		int heapSize = super.getSize() + 1;
		super.setSize(heapSize);
		heapDecreaseKey(heapSize - 1, key);
	}
	
	public void heapDelete(int idx) throws Exception {
		int heapSize = super.getSize();
		
		if(idx >= heapSize) {
			throw new Exception("Index should be smaller than heap size");
		}
		
		List<T> arr = super.getHeap();
		arr.set(idx, arr.get(heapSize - 1));
		
		super.setSize(heapSize - 1);
		
		minHeapify(idx, arr);
	}
}
