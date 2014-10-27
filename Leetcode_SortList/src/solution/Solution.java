package solution;

import java.util.HashMap;
import java.util.*;

public class Solution {
	public ListNode sortList(ListNode head) {
        if(head == null){
        	return null;
        }
        
        return mergeSort(head);
    }
	
	private ListNode mergeSort(ListNode head){
		
		if(head.next == null){
			return head;
		}
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode fast = dummy;
		ListNode slow = dummy;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		fast = slow.next;
		slow.next = null;
		
		slow = this.mergeSort(head);
		fast = this.mergeSort(fast);
		head = dummy;
		
		while(slow != null && fast !=null){
			if(slow.val < fast.val){
				head.next = slow;
				slow = slow.next;
			}
			else{
				head.next = fast;
				fast = fast.next;
			}

			head = head.next;
		}
		
		while(slow != null){
			head.next = slow;
			slow = slow.next;
			head = head.next;
		}
		
		while(fast != null){
			head.next = fast;
			fast = fast.next;
			head = head.next;
		}
		
		return dummy.next;
	}
}
