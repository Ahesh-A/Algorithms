package myds.queue;

import java.util.Arrays;

public class Queue<T> {
	
	private T[] arr;
	private int head = -1;
	private int tail = -1;
	
	@SuppressWarnings("unchecked")
	public Queue(int length) {
		this.arr = (T[])new Object[length];
	}

	public int gethead() {
		return head;
	}

	public void sethead(int head) {
		this.head = head;
	}

	public int gettail() {
		return tail;
	}

	public void settail(int tail) {
		this.tail = tail;
	}
	
	public String toString() {
		return Arrays.toString(this.arr);
	}
	
	public void offer(T element) throws Exception{
		if(this.tail == -1) {
			this.head = 0;
			this.tail = 0;
		}
		
		this.tail = (this.tail == this.arr.length - 1) ? 0  : this.tail + 1;
		
		if(tail == head) {
			throw new Exception("Queue overflow");
		}
		
		arr[this.tail] = element;
	}
	
	public void poll() {
		
	}
}
