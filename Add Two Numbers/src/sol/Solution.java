package sol;

public class Solution {

	/**
	 * You are given two linked lists representing two non-negative numbers. The
	 * digits are stored in reverse order and each of their nodes contain a
	 * single digit. Add the two numbers and return it as a linked list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A = new ListNode(1);
		A.next = new ListNode(2);
		A.next.next = new ListNode(3);
		A.next.next.next = new ListNode(4);
		A.next.next.next.next = new ListNode(5);
		
		ListNode B = new ListNode(1);
		B.next = new ListNode(2);
		B.next.next = new ListNode(3);
		B.next.next.next = new ListNode(4);
		B.next.next.next.next = new ListNode(5);
		
		A = new Solution().addTwoNumbers(A, B);
		
		while(A != null){
			System.out.println(A.val);
			A = A.next;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		int flag = 0;
		ListNode head = l1;
		
		while(l1.next != null && l2.next != null){
			int temp = l1.val + l2.val + flag;
			flag = temp / 10;
			temp = temp % 10;
			l1.val = temp;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		int temp = l1.val + l2.val + flag;
		flag = temp / 10;
		temp = temp % 10;
		l1.val = temp;
		
		
		if(l1.next == null && l2.next == null){
			if(flag > 0){
				l1.next = new ListNode(flag);
			}
		}
		else if(l1.next == null){
			l1.next = l2.next;
			if(flag > 0){
				l1 = l1.next;
				while(flag > 0 && l1.next != null){
					l1.val += flag;
					flag = l1.val / 10;
					l1.val %= 10;
					l1 = l1.next;
				}
				l1.val += flag;
				flag = l1.val / 10;
				l1.val %= 10;
				if(l1.next == null && flag > 0)
					l1.next = new ListNode(flag);
			}
				
		}
		else if(l2.next == null){
			if(flag > 0){
				l1 = l1.next;
				while(flag > 0 && l1.next != null){
					l1.val += flag;
					flag = l1.val / 10;
					l1.val %= 10;
					l1 = l1.next;
				}
				l1.val += flag;
				flag = l1.val / 10;
				l1.val %= 10;
				if(l1.next == null && flag > 0)
					l1.next = new ListNode(flag);
			}
		}
		
		return head;
        
    }

}
