package myds.countsort;

import org.ahesh.types.Node;

public class LinkedList<T> {
	Node<T> head;

	public LinkedList(Node<T> head) {
		super();
		this.head = head;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	
}
