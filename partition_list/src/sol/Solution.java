package sol;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ListNode A = new ListNode(7);
		A.next = new ListNode(80);
		A.next.next = new ListNode(9);
		A.next.next.next = new ListNode(90);
		A.next.next.next.next = new ListNode(3);
		A = new Solution().partition(A, 50);
		
		while(A != null){
			System.out.println(A.val);
			A = A.next;
		}
		
	}
	
	public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode n1,n2,X;
		ListNode current = head;
		
		X = new ListNode(x);
		n1 = X;
		n2 = X;	
		
		while (current != null) {
			if (current.val < x) {
				ListNode temp = current;
				current = current.next;
				
				if(n1.equals(X)){
					temp.next = X;
					n1 = temp;
					head = temp;
				}
				else{
					
					temp.next = X;
					n1.next = temp;
					n1 = temp;
				}
				

			} else {

				ListNode temp = current;
				current = current.next;
				temp.next = null;
				n2.next = temp;
				n2 = temp;

			}

		}	
		
		if(n1.equals(X)){
			head = X.next;
		}
		else{
			n1.next = X.next;
		}
		
		return head;
		
    }

}
