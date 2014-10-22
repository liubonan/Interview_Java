package solution;

public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1){
        	return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = head;
        ListNode prev = dummy;
        ListNode next = head;
        
        while(curr != null){

            int count = 1;
            ListNode tail = curr;
            while(count < k && curr != null){
            	curr = curr.next;
            	count++;
            }
            
            if(curr == null){
            	break;
            }
            
        	prev.next = curr;
        	next = curr.next;
        	curr.next = null;
        	this.reverse(tail);
        	prev = tail;
        	curr = next;
        	tail.next = next;
        }
        
        return dummy.next;
    }
	
	public ListNode reverse(ListNode oldHead){
		ListNode curr = oldHead, prev = null, next = oldHead;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
}
