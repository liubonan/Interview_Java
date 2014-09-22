package solution;

import java.util.HashMap;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
        	return null;
        }
        
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        ListNode current = head, prev = null;
        
        while(current != null){
        	if(!hashMap.containsKey(current.val)){
        		hashMap.put(current.val, current.val);
        		prev = prev == null ? head : prev.next;
        	}
        	else{
        		prev.next = current.next;
        	}
        	
        	current = current.next;
        }
        
        return head;
    }

}
