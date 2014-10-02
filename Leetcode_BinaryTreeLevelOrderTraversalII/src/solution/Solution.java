package solution;

import java.util.*;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> results = new LinkedList<List<Integer>>();
        
        if(root == null){
        	return results;
        }
        
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
        	int size = queue.size();
        	List<Integer> result = new ArrayList<Integer>(size);
        	for(int i = 0; i < size; i++){
        		TreeNode current = queue.poll();
        		result.add(current.val);
        		
        		if(current.left != null){
        			queue.offer(current.left);
        		}
        		
        		if(current.right != null){
        			queue.offer(current.right);
        		}
        	}
        	
        	results.add(result);
        }
        
        for(int i = 0; i < results.size() / 2; i++){
        	List<Integer> tmp = results.get(i);
        	results.set(i, results.get(results.size() - i - 1));
        	results.set(results.size() - i - 1, tmp);
        }
        
        return results;
    }
}
