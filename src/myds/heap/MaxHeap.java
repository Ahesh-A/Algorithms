package myds.heap;

import java.util.List;

public class MaxHeap<T> extends Heap<T>{
	 public MaxHeap() {
		super();
	}
	 
	public void maxHeapify(int i) {
		List<T> arr = super.getHeap();
		int length = arr.size();
		
//		if(length <= i) throw new Exception("");
		T var = arr.get(i);
		
		System.out.println("Heap: " + var);
	}
}
