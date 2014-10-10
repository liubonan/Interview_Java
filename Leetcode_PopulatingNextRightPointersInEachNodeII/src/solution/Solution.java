package solution;

public class Solution {
	public void connect(TreeLinkNode root) {
        if(root == null){
        	return;
        }
        
        TreeLinkNode upperLevel = root, nextLevel = null;
        TreeLinkNode prev = null;
        
        while(upperLevel != null){
        	while(upperLevel != null){
        		
        		if(upperLevel.left != null){
        			if(prev == null){
            			prev = upperLevel.left;
            			nextLevel = upperLevel.left;
            		}
            		else{
            			prev.next = upperLevel.left;
            			prev = prev.next;
            		}
        		}
        		
        		if(upperLevel.right != null){
        			if(prev == null){
            			prev = upperLevel.right;
            			nextLevel = upperLevel.right;
            		}
            		else{
            			prev.next = upperLevel.right;
            			prev = prev.next;
            		}
        		}
        		
        		upperLevel = upperLevel.next;
        	}
        	
        	prev = null;
        	upperLevel = nextLevel;
        	nextLevel = null;
        }
    }
}
