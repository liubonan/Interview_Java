package solution;

import java.util.HashMap;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
        	return null;
        }
        
        if(head.next == null){
        	return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        int count = 0;
        ListNode first = head, second = head;
        
        while(first != null && count <= n){
        	first = first.next;
        	count++;
        }
        
        while(first != null){
        	first = first.next;
        	second = second.next;
        }
        
        second.next = second.next.next;
        
        return head.next;
    }
}
