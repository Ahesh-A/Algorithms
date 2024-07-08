package ahesh.problems;

import java.util.List;

public class PalindromicLinkedList {
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
	
	public static ListNode findMid(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null ) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

	public static ListNode reverseList(ListNode head) {
		
		if(head.next == null) {
			return head;
		}
		
		ListNode res = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		
		return res;
	}
//	public static boolean isSubList(ListNode l1, ListNode l2) {
//		
//		while(l1 != null && l2 != null) {
//			
//			if(l1.val != l2.val) {
//				return false;
//			}
//			
//			l1 = l1.next;
//			l2 = l2.next;
//		}
//		
//		return true;
//	}
	
	public static void main(String[] args) {
		ListNode head = constructLinkedList(new int[] {1, 2, 2, 1});
		ListNode mid = findMid(head);
		ListNode res = reverseList(mid);
		printList(res);
		System.out.println(isSubList(res, head));
	}
	
}
