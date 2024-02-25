package myds.queue;

import java.util.Arrays;

public class Queue<T> {
	
	private T[] arr;
	private final int QUEUE_LENGTH;
	private int head = 0;
	private int tail = 0;
	private int size = 0;
	
	@SuppressWarnings("unchecked")
	public Queue(int length) {
		this.arr = (T[])new Object[length];
		this.QUEUE_LENGTH = length;
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
		this.tail = 0;
	}
	
	public void offer(T element) throws Exception{
		
		if(size == QUEUE_LENGTH) {
			throw new Exception("Queue overflow");
		}
		
		this.tail = evaluatedIndexValue(this.tail);
		
		arr[this.tail] = element;
		this.size++;
		
	}
	
	public T poll() throws Exception{
		
		if(size == 0) {
			throw new Exception("Queue underflow");
		}
		
		T result = this.arr[this.head];
		this.head = evaluatedIndexValue(this.head);
		this.size--;
		return result;
	}
}
