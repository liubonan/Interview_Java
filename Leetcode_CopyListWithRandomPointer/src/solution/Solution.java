package solution;

public class Solution {
	public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
        	return null;
        }
        
        RandomListNode curr = head, result = null;
        while(curr != null){
        	RandomListNode newNode = new RandomListNode(curr.label);
        	newNode.next = curr.next;
        	newNode.random = curr.random;
        	curr.next = newNode;
        	curr = newNode.next;
        }
        
        curr = head;
        while(curr != null){
        	if(curr.random != null){
            	curr.next.random = curr.next.random.next;
        	}
        	curr = curr.next.next;
        }
        
        curr = head;
        result = head.next;
        while(curr != null){
        	RandomListNode newNode = curr.next;
        	curr.next = newNode.next;
        	if(curr.next != null){
            	newNode.next = curr.next.next;
        	}
        	curr = curr.next;
        }
        
        return result;
    }
}
