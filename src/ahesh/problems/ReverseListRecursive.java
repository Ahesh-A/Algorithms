package ahesh.problems;



//class ListNode{
//	ListNode next;
//	int val;
//	
//	ListNode(){}
//	ListNode(int val) { this.val = val; }
//	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class ReverseListRecursive {
	
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
	
	public static ListNode reverseList(ListNode head) {
		if(head.next == null) {
			return head;
		}
		
		ListNode curr = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		
		return curr;
		
	}
	
	public static void main(String[] args) {
		ListNode node = constructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7});
//		printList(node);
		ListNode head = reverseList(node);
		printList(head);
	}
	
}
