package solution;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
	public ListNode partition(ListNode head, int x) {
        if(head == null){
        	return null;
        }
        
        ListNode dummyLeft = new ListNode(0);
        ListNode dummyRight = new ListNode(0);
        
        ListNode current = head, left = dummyLeft, right = dummyRight;
        
        while(current != null){
        	if(current.val < x){
        		left.next = current;
        		left = left.next;
        	}
        	else{
        		right.next = current;
        		right = right.next;
        	}
        	
        	current = current.next;
        }
        
        right.next = null;
    	left.next = dummyRight.next;

    	return dummyLeft.next;
    }
}
