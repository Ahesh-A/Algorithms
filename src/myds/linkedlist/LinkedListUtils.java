package myds.linkedlist;

import org.ahesh.types.Node;
public class LinkedListUtils {
	
	public static <T> Node<T> searchList(LinkedList<T> list, T target) {
		Node<T> temp = list.getHead();
		
		while(temp != null) {
			if(temp.value().equals(target)) {
				return temp;
			}
			
			temp = temp.next();
		}
		
		return null;
	}
	
	public static <T> void  printList(Node<T> head) {

		System.out.print("[ ");
		while(head != null) {
			System.out.print(head.value() + " ");
			head = head.next();
		}
		System.out.print("]");
	}
	
	public static <T> void  printList(LinkedList<T> list) {
		Node<T> head = list.getHead();
		System.out.print("[ ");
		while(head != null) {
			System.out.print(head.value() + " ");
			head = head.next();
		}
		System.out.print("]");
	}
	
	private static <T> Node<T> findPredecessor(LinkedList<T> list, T target) {
		Node<T> temp = list.getHead();
		while(temp != null) {
			if(temp.next().value().equals(target)) {
				return temp;
			}
			
			temp = temp.next();
		}
		
		return null;
	}
	
}
