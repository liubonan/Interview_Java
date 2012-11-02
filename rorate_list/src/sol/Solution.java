package sol;

public class Solution {

	/**
	 * @param args
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
		
		n = new Solution().rotateRight(n, 2);
		current = n;
		
		while(current != null){
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(n == 0){
			return head;
		}
		if(head == null){
			return head;
		}
		if(head.next == null){
			return head;
		}
		
		int length = 0;		
		int count = 0;		
		
		ListNode current = head;
		ListNode runner = head;
		while(runner != null){
			length++;
			runner = runner.next;
		}
		
		n = n % length;
		runner = head;
		
		while(count != n){
			count++;
			runner = runner.next;
		}
		
		if(runner == null)
			return head;
		
		while(runner.next != null){
			current = current.next;
			runner = runner.next;
		}
		
		runner.next = head;
		head = current.next;
		current.next = null;
		
		return head;
    }

}
