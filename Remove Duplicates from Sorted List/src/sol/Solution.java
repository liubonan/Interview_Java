package sol;

public class Solution {

	/**
	 * Given a sorted linked list, delete all duplicates 
	 * such that each element appear only once.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,1,2,3,4,4,5,5,5,6};
		ListNode n = new ListNode(1);
		ListNode current = n;
		for(int i : A){
			current.next = new ListNode(i);
			current = current.next;
		}
		current = n;
		new Solution().deleteDuplicates(n);
		while(current != null){
			System.out.println(current.val);
			current = current.next;
		}

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(head == null || head.next == null)
			return head;
		else{
			ListNode current = head.next;
			ListNode prev = head;
			
			while (current != null) {
				if (current.val == prev.val) {
					prev.next = current.next;
					current = current.next;
				} else {
					prev = current;
					current = current.next;
				}
			}
			
			return head;
		}
        
    }
	
	
}
