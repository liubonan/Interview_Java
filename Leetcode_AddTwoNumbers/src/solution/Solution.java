package solution;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}
		
		if(l2 == null){
			return l1;
		}
		
        int carry = 0;
        
        ListNode h1 = l1, h2 = l2, prev = null, head = null;
        
        while(h1 != null && h2 != null){
        	if(prev == null){
        		prev = new ListNode((h1.val + h2.val) % 10);
        		carry = (h1.val + h2.val) / 10;
        		head = prev;
        	}
        	else{
        		prev.next = new ListNode((h1.val + h2.val + carry) % 10);
        		carry = (h1.val + h2.val + carry) / 10;
        		prev = prev.next;
        	}
        	
        	h1 = h1.next;
        	h2 = h2.next;
        }
        
        while(h1 != null){
        	prev.next = new ListNode((h1.val + carry) % 10);
    		carry = (h1.val + carry) / 10;
    		prev = prev.next;
    		h1 = h1.next;
        }
        
        while(h2 != null){
        	prev.next = new ListNode((h2.val + carry) % 10);
    		carry = (h2.val + carry) / 10;
    		prev = prev.next;
    		h2 = h2.next;
        }
        
        if(carry != 0){
        	prev.next = new ListNode(carry);
        }
        
        return head;
    }
}
