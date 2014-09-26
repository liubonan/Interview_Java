package solution;

public class Solution {
	public boolean hasCycle(ListNode head) {
		
		if(head == null || head.next == null){
			return false;
		}
        
		ListNode fast = head.next, slow = head;
		
		while(fast != null && 
				fast.next != null &&
				fast != slow){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return fast == slow;
    }
}
