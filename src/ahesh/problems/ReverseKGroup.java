package ahesh.problems;

import org.ahesh.types.ListNode;
public class ReverseKGroup {
	public static ListNode getNthNodeFromLast(ListNode head, int n) {
			
		ListNode sudoHead = new ListNode();
		sudoHead.next = head;
		ListNode temp = sudoHead;
		ListNode pointer = sudoHead;
		
		for (int i = 0; i < n; i++) {
			if(temp == null) {
				return null;
			}
			
			temp = temp.next;
		}
		
		while(temp != null) {
			temp = temp.next;
			pointer = pointer.next;
		}
		
		return pointer;
	}
	
	public static void severBond(ListNode head, ListNode node) {
		ListNode temp = head;
		
		while(temp.next != node) {
			temp = temp.next;
		}
		
		temp.next = null;
	}
	
	public static void linkNode (ListNode head) {
		ListNode temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
			
		}
		
		temp.next = head;
	}
	
	
	public static ListNode reverseByN(ListNode head, int reverseFactor) {
		if(reverseFactor == 0) {
			return head;
		}
		
		ListNode res = getNthNodeFromLast(head, reverseFactor);
		linkNode(head);
		severBond(head, res);
		
		return res;
	}
	
	public static int getLength(ListNode head) {
		ListNode temp = head;
		int res = 0;
		
		while(temp != null) {
			temp = temp.next;
			res++;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.constructLinkedList(new int [] {1, 2, 3, 4, 5, 6, 7, 8});
		int length = getLength(head);
		ListNode pointer = reverseByN(head, 9 % length);
		ListNode.printList(pointer);
	}
}
