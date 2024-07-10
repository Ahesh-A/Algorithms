//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
// 
//
//Example 1:
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

package ahesh.problems;

public class AddTwoNumbers {
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
	
	public static int addNum(ListNode node1, ListNode node2, int num) {
		int val1 = 0;
		int val2 = 0;
		
		if(node1 != null) {
			val1 = node1.val;
		}
		
		if(node2 != null) {
			val2 = node2.val;
		}
		
		return val1 + val2 + num;
	}
	
	public static void main(String[] args) {
		ListNode l1 = constructLinkedList(new int[] {2, 4, 3});
		ListNode l2 = constructLinkedList(new int[] {5,6,4});
		
		int carry = 0;
		ListNode head = null;
		ListNode temp = head;
//		
//		printList(l1);
		while(l1 != null || l2 != null) {
			int  res = addNum(l1, l2, carry);
			
			if(res >= 10) {
				res %= 10;
				carry = 1;
			} else {
				carry = 0;
			}
			
			ListNode node = new ListNode(res);
			
//			System.out.println(node.val);
			if(head == null) {
				head = node;
				temp = head;
			} else {
				temp.next = node;
				temp = temp.next;
			}
			
			if(l1 != null) {
				l1 = l1.next;
			}
			
			if(l2 != null) {
				l2 = l2.next;
			}
			
		}
		
		
		if(carry != 0) {
			temp.next = new ListNode(1);
		}
		
		printList(head);
	}
}
