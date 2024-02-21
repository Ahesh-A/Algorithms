package myds.stack;

import java.util.List;
import java.util.ArrayList;

public class Stack<T> {
	
	private int length;
	private List<T> arr;
	
	
	public Stack(int length) {
		this.arr = new ArrayList<T> ();
		this.length = length;
	}

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public List<T> getArr() {
		return arr;
	}


	public void setArr(List<T> arr) {
		this.arr = arr;
	}
	
	public void push(T element) throws Exception{
		if(length <= this.arr.size()) {
			throw new Exception("Stack overflow");
		}
		
		this.arr.add(element);
		
	}
	
	public T  pop() throws Exception{
		int size = this.arr.size();
		if(size == 0) {
			throw new Exception("Stack underflow");
		}
		
		T result = this.arr.get(size  - 1);
		this.arr.remove(result);
		
		return result;
	}	
	
	public String toString() {
		return this.arr.toString();
	}
	
}
