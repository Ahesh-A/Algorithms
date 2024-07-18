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
	
	public static void LinkNode (ListNode head) {
		ListNode temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = head;
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.constructLinkedList(new int [] {1, 2, 3, 4, 5, 6, 7, 8});
		ListNode pointer = getNthNodeFromLast(head, 2);
		System.out.println(pointer.val);
	}
}
