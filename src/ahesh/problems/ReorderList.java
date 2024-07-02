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
	
	public static void main(String[] args) {
		ListNode linkedList = constructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7 });
		printList(linkedList);
	}
}
