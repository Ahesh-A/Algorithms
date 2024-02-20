package org.ahesh.types;

public class Node<T> {
	private T value;
	private Node<T> next;
	
	public Node() {
		this.value = null;
		this.next = null;
	}
	
	public Node(T value) {
		this.value = value;
		this.next = null;
	}
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public T value() {
		return this.value;
	}
	
	public Node<T> next() {
		return this.next;
	}
}
