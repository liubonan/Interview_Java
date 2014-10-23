package solution;

public class Solution {
	public void reorderList(ListNode head) {
        if(head == null){
        	return;
        }
        
        ListNode midNode = this.getMid(head);
        midNode = this.reserve(midNode);
        this.merge(head, midNode);
    }
	
	private ListNode getMid(ListNode head){
		ListNode fast = head, slow = head;
		
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode result = slow.next;
		slow.next = null;
		return result;
	}
	
	private ListNode reserve(ListNode head){
		ListNode prev = null, curr = head;
		
		while(curr != null){
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
	
	private void merge(ListNode first, ListNode second){
		ListNode dummy = new ListNode(0);
		while(first != null && second != null){
			ListNode next1 = first.next, next2 = second.next;
			dummy.next = first;
			first.next = second;
			dummy = second;
			first = next1;
			second = next2;
		}
		
		if(first != null){
			dummy.next = first;
		}
	}
}
