package org.ahesh.types;

public class DLNode<T> {
	private T value;
	private DLNode<T> next;
	private DLNode<T> prev;
	
	DLNode() {
		this.value = null;
		this.next = this;
		this.prev = this;
	}
	
	DLNode(T value) {
		this.value = value;
		this.next = this;
		this.prev = this;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public DLNode<T> getNext() {
		return next;
	}

	public void setNext(DLNode<T> next) {
		this.next = next;
	}

	public DLNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DLNode<T> prev) {
		this.prev = prev;
	}
	
	
}
