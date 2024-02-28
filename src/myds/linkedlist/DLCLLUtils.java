package myds.linkedlist;

import org.ahesh.types.DLNode;

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
}
