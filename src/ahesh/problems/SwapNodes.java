package ahesh.problems;

import org.ahesh.types.ListNode;

public class SwapNodes {
	
	public static ListNode swapNodes(ListNode head) {
		ListNode node = new ListNode();
		node.next = head;
		
		
		return node.next;
	}
	public static void main(String[] args) {
		ListNode head = ListNode.constructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
		ListNode.printList(head);
	}
}
