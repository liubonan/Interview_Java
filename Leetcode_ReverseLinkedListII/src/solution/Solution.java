package solution;

public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
        	return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        
        int count = 1;
        while(count++ < m){
        	curr = curr.next;
        	prev = prev.next;
        }
        ListNode left = prev;
        ListNode first = curr;
        
        prev = prev.next;
        curr = curr.next;
        
        while(count++ <= n){
        	ListNode next = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = next;
        }
        
        first.next = curr;
        left.next = prev;
        
        return dummy.next;
    }
}
