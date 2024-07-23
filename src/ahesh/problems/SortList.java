package ahesh.problems;

import org.ahesh.types.ListNode;

public class SortList {
	
	public static void swap(ListNode p1, ListNode p2) {
		int temp = p1.val;;
		p1.val = p2.val;
		p2.val = temp;
	}
	
	public static void sortList(ListNode head) {
		ListNode leftPtr = head;
		ListNode rightPtr = head;
		
		while (leftPtr != null) {
			rightPtr = leftPtr;
			while (rightPtr != null) {
				if(leftPtr.val > rightPtr.val) {
					swap(leftPtr, rightPtr);
				}
				
				rightPtr = rightPtr.next;
			}
			
			leftPtr = leftPtr.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.constructLinkedList(new int[] {5, 3, 1, 2, 7});
		sortList(head);
		ListNode.printList(head);
	}
}
