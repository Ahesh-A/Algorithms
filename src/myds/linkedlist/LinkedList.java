package myds.linkedlist;

import org.ahesh.types.Node;

public class LinkedList<T> {
	Node<T> head;

	public LinkedList(Node<T> head) {
		this.head = head;
	}
	
	public LinkedList(T[] arr) {
		this.head = new Node<T>(null);
		Node<T> temp = this.head;
		
		for(T element : arr) {
			temp.setNext(new Node<T>(element));
			temp = temp.next();
		}
		
		this.head = this.head.next();
	}
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
}
