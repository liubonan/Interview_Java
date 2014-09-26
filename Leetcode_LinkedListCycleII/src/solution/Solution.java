package solution;

public class Solution {
	public ListNode detectCycle(ListNode head) {

		if (head == null || head.next == null) {
			return null;
		}

		ListNode fast = head.next, slow = head;

		while (fast != null && fast.next != null && fast != slow) {
			fast = fast.next.next;
			slow = slow.next;
		}

		if(fast != slow){
			return null;
		}
		
		slow = head;
		fast = fast.next;
		
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}
}
