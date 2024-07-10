package ahesh.problems;

public class RemoveNthNode {
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
		ListNode l = constructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
		
	}
}
