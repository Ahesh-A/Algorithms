package myds.queue;

import java.util.Arrays;

public class Queue<T> {
	
	private T[] arr;
	private int start = 0;
	private int end = 0;
	
	@SuppressWarnings("unchecked")
	public Queue(int length) {
		this.arr = (T[])new Object[length];
	}
	
	public void offer(T element) {
		
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public String toString() {
		return Arrays.toString(this.arr);
	}
}
