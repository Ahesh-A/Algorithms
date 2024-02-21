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
	
	public void push(T element) {
		if(length == this.arr.size()) {
			throw new Exception("Stack over flow");
		}
		
		this.arr.add(element);
		
	}
	
	public 
	
}
