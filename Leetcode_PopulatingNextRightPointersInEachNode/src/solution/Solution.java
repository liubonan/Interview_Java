package solution;

public class Solution {
	public void connect(TreeLinkNode root) {
        if(root == null){
        	return;
        }
        
        TreeLinkNode upperLevel = root, nextLevel = null;
        TreeLinkNode prev = null, curr = null;
        
        while(upperLevel.left != null){
        	while(upperLevel != null){
        		if(prev == null){
        			prev = upperLevel.left;
        			nextLevel = upperLevel.left;
        		}
        		else{
        			prev.next = upperLevel.left;
        			prev = prev.next;
        		}
        		
        		prev.next = upperLevel.right;
        		prev = prev.next;
        		upperLevel = upperLevel.next;
        	}
        	
        	prev = null;
        	upperLevel = nextLevel;
        }
    }
}
