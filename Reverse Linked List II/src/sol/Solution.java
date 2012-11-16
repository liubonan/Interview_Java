package sol;

public class Solution {

	/**
	 * Reverse a linked list from position m to n. Do it in-place and in
	 * one-pass.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {3};
		ListNode n = new ListNode(1);
		ListNode current = n;
		for(int i : A){
			current.next = new ListNode(i);
			current = current.next;
		}
		
		n = new Solution().reverseBetween(n,1,2);
		current = n;
		while(current != null){
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(m == n)
        	return head;
        ListNode curr = head;
        ListNode prev = null;
        n = n - m + 1;
        
        while(m > 1){
        	prev = curr;
        	curr = curr.next;        	
        	m--;
        }
        
        ListNode p1 = curr;
        curr = curr.next;
        ListNode p2 = curr.next;
        
        
        while(n > 2){
        	curr.next = p1;
        	
        	p1 = curr;
        	curr = p2;
        	p2 = p2.next;
        	
        	n--;
        }

        curr.next = p1;
        if(prev != null){
        	prev.next.next = p2;
        	prev.next = curr;
        }
        else{
        	head.next = p2;
        	head = curr;
        }        
        
        return head;	
    }
	
	

}
