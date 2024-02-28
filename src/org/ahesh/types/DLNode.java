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
	
	
}
