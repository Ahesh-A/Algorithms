package myds.linkedlist;

import org.ahesh.types.DLNode;
import org.ahesh.types.Node;

public class DLCLLUtils {
	
	public static <T> DLNode<T> searchList(DLCLL<T> list, T target) {
		DLNode<T> temp = list.getHead().getNext();
		
		while(temp.getValue() != null) {
			if(temp.getValue().equals(target)) {
				return temp;
			}
			
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public static <T> void  printList(DLCLL<T> list) {
		DLNode<T> head = list.getHead().getNext();
		System.out.print("[ ");
		
		while(head.getValue() != null) {
			System.out.print(head.getValue() + " ");
			head = head.getNext();
		}
		System.out.print("]");
	}
	
	
}
