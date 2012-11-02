package sol;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2,2};
		ListNode n = new ListNode(1);
		ListNode current = n;
		for(int i : A){
			current.next = new ListNode(i);
			current = current.next;
		}
		
		n = new Solution().deleteDuplicates(n);
		current = n;
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
			boolean head_null = false;
			
			while(current.val == prev.val){
				
				current = current.next;
				head_null = true;
				
				if(current == null){
					return null;
				}
			}
			
			if(head_null){
				head = new ListNode(-1);
				prev = head;
				head.next = current;
			}
			
			boolean flag = false;
			while (current != null && current.next != null) {
				if (current.next.val == current.val) {
					current = current.next;
					flag = true;
				} 
				else {

					if (flag) {
						if(current.next.next != null && 
								current.next.val == current.next.next.val){
							current = current.next;
						}
						else{
							prev.next = current.next;
							prev = prev.next;
							current = prev.next;
							flag = false;
						}
						
					} else {
						prev = current;
						current = current.next;
					}
				}
			}
			
			if(flag)
	            prev.next = null;
			
			if(head_null)
				return head.next;
			else
				return head;
		}
        
    }

}
