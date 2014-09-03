package solution;

public class Solution {
	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null){
			return l2;
		}
		
		if(l2 == null){
			return l1;
		}
		
		ListNode i_l1, i_l2, head, i_main;
		
		i_l1 = l1;
		i_l2 = l2;
		head = null;
		i_main = null;
		
		while(i_l1 != null && i_l2 != null){
			ListNode temp = null;
			
			if(i_l1.val <= i_l2.val){
				temp = new ListNode(i_l1.val);
				i_l1 = i_l1.next;
			}
			else{
				temp = new ListNode(i_l2.val);
				i_l2 = i_l2.next;
			}
			
			if(i_main == null){
				head = temp;
				i_main = temp;
			}
			else{
				i_main.next = temp;
				i_main = i_main.next;
			}
		}
		
		copyRemainNodes(i_l1, i_main);
		copyRemainNodes(i_l2, i_main);
		
        return head;
    }
	
	private void copyRemainNodes(ListNode i, ListNode i_main){
		if(i != null){
			while(i != null){
				i_main.next = new ListNode(i.val);
				i_main = i_main.next;
				i = i.next;
			}
		}
	}

}
