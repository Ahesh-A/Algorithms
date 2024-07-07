//You are given the head of a singly linked-list. The list can be represented as:
//
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.
//
// 
//
//Example 1:
//
//
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]
//Example 2:
//
//
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]
// 
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 5 * 104].
//1 <= Node.val <= 1000

package ahesh.problems;

class ListNode{
	ListNode next;
	int val;
	
	ListNode(){}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReorderList {
		
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
	
	public static ListNode severLastNode(ListNode n) {
		if(n == null) return null;
		
		if(n.next == null) {
			return n;
		}
		
		ListNode temp = n;
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		ListNode res = temp.next;
		
		temp.next = null;
		
		return res;
		
	}
	
	public static ListNode reverseList(ListNode n) {
		ListNode prev = null;
		ListNode curr = n;
		ListNode next = n.next;
		
		while(next != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = next.next;
		}
		
		curr.next = prev;
		return curr;
	}
	
	public static ListNode getMiddle(ListNode n) {
		ListNode slow = n;
		ListNode fast = n;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}
	
	public static void breakChain(ListNode head, ListNode n) {
		if(head == null) {
			return;
		}
		
		ListNode temp = head;
		
		while (temp.next != null && !temp.next.equals(n)) {
			temp = temp.next;
		}
		
		temp.next = null;

	}
	
	public static ListNode mergeChain(ListNode ch1, ListNode ch2) {
		ListNode head = new ListNode();
		ListNode temp = head;
		
		while (ch1 != null && ch2 != null) {
			temp.next = ch1;
			ch1 = ch1.next;
			temp = temp.next;
			temp.next = ch2;
			ch2 = ch2.next;
			temp = temp.next;
		}
		
		if(ch1 != null) {
			temp.next = ch1;
		}
		
		if(ch2 != null) {
			temp.next = ch2;
		}
		
		return head.next;
	}
	
	
	public static void reOrderList(ListNode n) {
		ListNode temp = n;
		
		while(temp != null && temp.next != null && temp.next.next != null) {
			ListNode lastNode = severLastNode(temp);
			lastNode.next = temp.next;
			temp.next = lastNode;
			temp = lastNode.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		ListNode linkedList = constructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7});
//		ListNode head = reverseList(linkedList);
		ListNode mid = getMiddle(linkedList);
//		System.out.println(mid.val);
		breakChain(linkedList, mid);
		ListNode rev = reverseList(mid);
		
//		printList(linkedList);
//		System.out.println();
		ListNode mergedList = mergeChain(linkedList, rev);
		printList(mergedList);
//		ListNode lastNode = severLastNode(linkedList);
//		System.out.println(mid.val);
//		reOrderList(linkedList);
//		printList(head);
	}
}
