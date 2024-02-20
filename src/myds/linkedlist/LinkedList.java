package myds.linkedlist;

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
	
	public void printList(Node<T> head) {
		System.out.print("[");
		while(head != null) {
			System.out.print(head.value() + " ");
			head = head.next();
		}
		System.out.print("]");
	}
	
}
