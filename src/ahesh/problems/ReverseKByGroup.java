package ahesh.problems;

import org.ahesh.types.ListNode;

public class ReverseKByGroup {
	
	public static ListNode getNextK(ListNode node, int k) {
		ListNode temp = node;
		
		for(int i = 0; i < k; i++) {
			if(temp == null) {
				return temp;
			}
			temp = temp.next;
		}
		
		return temp;
	}
	
	public static ListNode reverseList(ListNode start, ListNode end) {
		
		if(end == null) {
			return start;
		}
		
		if(start == end) {
			return end;
		}
		
		ListNode res = reverseList(start.next, end);
		start.next.next = start;
		start.next = null;
		return res;
		
	}
	
	public static ListNode reverseKByNodes(ListNode head, int k) {
		ListNode dummy = new ListNode();
		
		dummy.next = head;
		ListNode ances = dummy;
		ListNode start = head;
		ListNode end = getNextK(ances, k);
		
		
		if(end == null) {
			return dummy.next;
		}
		
		ListNode parent = end.next;
		
		while(end != null) {
			ListNode rev = reverseList(start, end);
			ances.next = rev;
			start.next = parent;
			ances = start;
			start = parent;
			end = getNextK(ances, k);
			
			if(end != null) {				
				parent = end.next;
			}
			
		}
		
		return dummy.next;
		
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.constructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7 });
		ListNode res = reverseKByNodes(head, 190);
		ListNode.printList(res);
	}
}
