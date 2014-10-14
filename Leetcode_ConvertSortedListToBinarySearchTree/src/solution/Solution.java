package solution;

import java.util.*;

public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
        	return null;
        }
        
        int size = this.getSize(head);
        
        return this.search(head, size);
    }
	
	private TreeNode search(ListNode head, int size){
		if(size == 0){
			return null;
		}
		
		int mid = 1;
		
		ListNode midNode = head;
		
		while(mid < (size + 1) / 2){
			midNode = midNode.next;
			mid ++;
		}
		
		TreeNode root = new TreeNode(midNode.val);
		root.left = this.search(head, (size - 1) / 2);
		root.right = this.search(midNode.next, size / 2);
		
		return root;
	}
	
	private int getSize(ListNode head){
		
		int count = 0;
		
		while(head != null){
			head = head.next;
			count++;
		}
		
		return count;
	}
}
