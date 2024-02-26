package myds.linkedlist;

import org.ahesh.types.Node;
public class LinkedListUtils {
	
	public static <T> Node<T> searchList(Node<T> head) {
		
		return new Node<T>();
	}
	
	public <T> void  printList(Node<T> head) {
		System.out.print("[");
		while(head != null) {
			System.out.print(head.value() + " ");
			head = head.next();
		}
		System.out.print("]");
	}
}
