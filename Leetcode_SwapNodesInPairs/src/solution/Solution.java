package solution;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode current = head, previous = null;
		
		head = this.swap(current);
		previous = current;
		current = current.next;
		
		while(current != null && current.next != null){
			previous.next = this.swap(current);
			previous = current;
			current = current.next;
		}
		
        return head;
    }
	
	private ListNode swap(ListNode i){
		ListNode j = i.next;
		i.next = j.next;
		j.next = i;
		
		return j;
	}
}
