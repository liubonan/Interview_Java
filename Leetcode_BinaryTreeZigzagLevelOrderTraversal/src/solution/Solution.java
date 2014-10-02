package solution;

import java.util.*;

public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> results = new LinkedList<List<Integer>>();
        
        if(root == null){
        	return results;
        }
        
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        boolean isFromLeftToRight = true;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
        	int size = queue.size();
        	List<Integer> result = new ArrayList<Integer>(size);
        	for(int i = 0; i < size; i++){
        		TreeNode current = queue.poll();
        		
        		if(isFromLeftToRight){
        			result.add(current.val);
        		}
        		else{
        			result.add(0, current.val);
        		}
        		
        		
        		if(current.left != null){
        			queue.offer(current.left);
        		}
        		
        		if(current.right != null){
        			queue.offer(current.right);
        		}
        	}
        	
        	results.add(result);
        	isFromLeftToRight = !isFromLeftToRight;
        }
        
        return results;
    }
}
