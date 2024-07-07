package ahesh.problems;

public class RemoveElement {
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
	
	public static ListNode removeNode(ListNode head, int val) {
		ListNode res = new ListNode();
		ListNode prev = res;
		res.next = head;
		ListNode temp = head;
			
		while(temp != null) {
			
			if(temp.val == val) {
				temp = temp.next; 
				prev.next.next = null;
				prev.next = temp;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
		
		return res.next;
	}
	
	public static void main(String[] args) {
		ListNode head = constructLinkedList(new int[] {4, 4, 4, 1, 2, 3, 4, 4, 4, 5, 6, 4, 4});
		ListNode res = removeNode(head, 4);
		printList(res);
	}
}
