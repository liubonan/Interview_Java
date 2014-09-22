package solution;

import java.util.HashMap;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
        	return null;
        }
        
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        
        ListNode current = head, prev = dummy;
        
        while(current != null){
        	int value = current.val;
        	
        	if(current.next != null && current.next.val == value){

            	while(current.next != null && current.next.val == value){
            		current = current.next;
            	}

            	prev.next = current.next;
            	current = current.next;
        	}
        	else{
            	current = current.next;
            	prev = prev.next;
        	}
        }
        
        return dummy.next;
    }
}
