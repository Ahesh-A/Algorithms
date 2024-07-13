package org.ahesh.types;

public class ListNode {
	public ListNode next;
	public int val;
	
	public ListNode(){}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	public static ListNode constructLinkedList(int[] arr) {
		ListNode head = new ListNode();
		ListNode temp = head;
		for(int i : arr) {
			ListNode node = new ListNode(i);
			temp.next = node;
			temp = node;
		}
		
		return head.next;
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
}
