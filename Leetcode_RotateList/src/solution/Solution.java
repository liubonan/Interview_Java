package solution;

public class Solution {
	public ListNode rotateRight(ListNode head, int n) {
        if(head == null){
        	return null;
        }
        
        int count = this.getCount(head);
        n = n % count;
        
        if(n == 0){
        	return head;
        }
        
        ListNode first = head;
        while(n >= 0){
        	first = first.next;
        	n--;
        }
        
        ListNode second = head;
        while(first != null){
        	first = first.next;
        	second = second.next;
        }
        
        ListNode newHead = second.next;
        second.next = null;
        
        second = newHead;
        while(second.next != null){
        	second = second.next;
        }
        
        second.next = head;
        return newHead;
    }
	
	private int getCount(ListNode head){
		int count = 0;
		while(head != null){
			head = head.next;
			count++;
		}
		
		return count;
	}
}
