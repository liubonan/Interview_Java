package sol;

public class Solution {

	/**
	 * Given a linked list, remove the nth node from the end of list and return
	 * its head.
	 * 
	 * For example,
	 * 
	 * Given linked list: 1->2->3->4->5, and n = 2.
	 * 
	 * After removing the second node from the end, the linked list becomes
	 * 1->2->3->5.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		//head.next.next = new ListNode(3);
		//head.next.next.next = new ListNode(4);
		//head.next.next.next.next = new ListNode(5);
		
		head = new Solution().removeNthFromEnd(head, 2);
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head.next == null)
        	return null;
        ListNode n1 = head;
        while(n > 0){
        	n1 = n1.next;
        	n--;
        }
        if(n1 == null)
        	return head.next;
        
        ListNode n2 = head;
        while(n1.next != null){
        	n1 = n1.next;
        	n2 = n2.next;
        }
        n2.next = n2.next.next;
        return head;
        
    }

}
