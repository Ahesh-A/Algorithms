package ahesh.problems;

import org.ahesh.types.ListNode;

public class SortList {
	
	public static void swap(ListNode p1, ListNode p2) {
		int temp = p1.val;;
		p1.val = p2.val;
		p2.val = temp;
	}
	
	public static void checkAndSwap(ListNode leftPtr, ListNode rightPtr) {
		if(leftPtr.val > rightPtr.val) {
			swap(leftPtr, rightPtr);
		}
	}
	
	public static void rightTraverser(ListNode leftPtr, ListNode rightPtr) {
		while (rightPtr != null) {
			checkAndSwap(leftPtr, rightPtr);
			rightPtr = rightPtr.next;
		}
	}
	
	public static void sortList(ListNode head) {
		ListNode leftPtr = head;
		ListNode rightPtr = head;
		
		while (leftPtr != null) {
			rightPtr = leftPtr;
			rightTraverser(leftPtr, rightPtr);
			leftPtr = leftPtr.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.constructLinkedList(new int[] {5, 3, 1, 2, 7});
		sortList(head);
		ListNode.printList(head);
	}
}
