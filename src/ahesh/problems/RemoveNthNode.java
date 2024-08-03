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
	
	public static ListNode removeNthNode(ListNode head, int n) {
		
		ListNode sudoHead = new ListNode();
		
		sudoHead.next = head;
		ListNode temp = sudoHead;
		
		for(int i = 0; i < n; i++) {
			if(temp != null) {
				temp = temp.next;
			}
		}
		
		if(temp == null) {
			return head;
		}
		
		ListNode follower = sudoHead;
		
		while(temp.next != null) {
			follower = follower.next;
			temp = temp.next;
		}
		
		ListNode remNode = follower.next;
		follower.next = remNode.next;
		
		remNode.next = null;
		
		return sudoHead.next;
	}
	
	public static void main(String[] args) {
		ListNode l = constructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
		ListNode head = removeNthNode(l, 2);
		printList(head);
	}
}
