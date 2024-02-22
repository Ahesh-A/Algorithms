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
	
	public int evaluatedIndexValue(int idx) {
		return (idx == this.arr.length - 1) ? 0  : idx + 1;
	}
	
	public void initialInsert(T element) {
		this.arr[0] = element;
		this.head = 0;
		this.tail = 1;
	}
	
	public void offer(T element) throws Exception{

		if(this.tail == -1) {
			initialInsert(element);
			return;
		}
		
		if(this.tail == this.head) {
			throw new Exception("Queue overflow");
		}
		
		arr[this.tail] = element;
		
		this.tail = evaluatedIndexValue(this.tail);
		
	}
	
	public void poll() throws Exception{
		
		if(head == tail) {
			throw new Exception("Queue underflow");
		}
		
		
	}
}