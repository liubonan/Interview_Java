package soltuion;

import java.util.*;

public class Solution {
	public int minDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int level = 1;
        
        while(!queue.isEmpty()){
        	int size = queue.size();
        	
        	for(int i = 0; i < size; i++){
        		TreeNode curr = queue.poll();
        		
        		if(curr.left == null && curr.right == null){
        			return level;
        		}
        		
        		if(curr.left != null){
        			queue.offer(curr.left);
        		}
        		
        		if(curr.right != null){
        			queue.offer(curr.right);
        		}
        	}
        	
        	level++;
        }
        
        return -1;
    }
}
