package solution;

public class Solution {
	public ListNode insertionSortList(ListNode head) {
        if(head == null){
        	return null;
        }
        
        ListNode dummyNode = new ListNode(Integer.MIN_VALUE);
        dummyNode.next = head;
        
        ListNode curr = head, tail = dummyNode;
        
        while(curr != null){
        	tail.next = curr.next;
        	curr.next = null;
        	
        	// insert
        	ListNode scanner = dummyNode;
        	
        	while(scanner != tail && curr.val >= scanner.next.val){
        		scanner = scanner.next;
        	}
        	
        	curr.next = scanner.next;
        	scanner.next = curr;
        	
        	if(scanner == tail){
        		tail = tail.next;
        	}
        	
        	curr = tail.next;
        }
        
        return dummyNode.next;
    }
}
