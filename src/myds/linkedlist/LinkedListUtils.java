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
	
	private static <T> Node<T> findPredecessor(LinkedList<T> list, Node<T> target) {
		Node<T> temp = list.getHead();
		while(temp != null && temp.next() != null) {
			if(temp.next().equals(target)) {
				return temp;
			}
			
			temp = temp.next();
		}
		
		return null;
	}
	
	public static <T> void deleteList(LinkedList<T> list, Node<T> target) {
		Node<T> head = list.getHead();
		
		if(head.equals(target)) {
			list.setHead(head.next());
		}
		
		Node<T> predecessor = findPredecessor(list, target);
		
		if(predecessor != null) {
			predecessor.setNext(predecessor.next().next());
		}
	}
	
	public static <T> Node<T> getNodeAtIdx(LinkedList<T> list, int idx) {
		if(idx < 0) return null;
		
		Node<T> temp = list.getHead();
		
		for(int i = 0; i < idx; i++) {
			if(temp == null) return null;
			temp = temp.next();
		}
		
		return temp;
	}
	
}
