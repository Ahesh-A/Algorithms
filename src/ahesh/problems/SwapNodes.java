package ahesh.problems;

import org.ahesh.types.ListNode;

public class SwapNodes {
	
	public static void swapHelper(ListNode parent, ListNode p1, ListNode p2) {
		p1.next = p2.next;
		p2.next = p1;
		parent.next = p2;
	}
	
	public static ListNode swapNodes(ListNode head) {
		
		if(head == null) {
			return head;
		}
		
		ListNode node = new ListNode();
		node.next = head;
		
		ListNode parent = node;
		ListNode pointer1 = head;
		ListNode pointer2 = head.next;
		
		while(pointer1 != null && pointer2 != null) {
			swapHelper(parent, pointer1, pointer2);
			if(parent.next == null || pointer1.next == null) {
				return node.next;
			}
			
			parent = pointer1;				
			pointer1 = parent.next;				
			pointer2 = pointer1.next;
		}
		
		return node.next;
	}
	public static void main(String[] args) {
		ListNode head = ListNode.constructLinkedList(new int[] {1, 7});
		head = swapNodes(head);
		ListNode.printList(head);
	}
}
