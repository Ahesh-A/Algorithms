package myds.linkedlist;

import org.ahesh.types.DLNode;

public class DLCLL<T> {
	DLNode<T> head;
	
	public DLCLL(DLNode<T> head) {
		this.head = head;
	}
	
	public DLCLL(T[] arr) {
		this.head = new DLNode<T>(null);
		DLNode<T> temp = head;
		
		for(T element : arr) {
			DLNode<T> newNode = new DLNode<>(element);
			newNode.setPrev(temp);
			temp.setNext(newNode);
			temp = temp.getNext();
		}
		
		temp.setNext(head);
	}
	
	
}


