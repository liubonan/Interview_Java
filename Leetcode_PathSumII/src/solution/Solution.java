package solution;

import java.util.*;

public class Solution {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> results = new LinkedList<List<Integer>>();
        if(root == null){
        	return results;
        }
        
        this.search(root, sum, new LinkedList<Integer>(), results);
        return results;
    }
	
	private void search(TreeNode node, int sum, List<Integer> result, List<List<Integer>> results){
		if(node.left == null && node.right == null){
			if(sum == node.val){
				List<Integer> currResult = new LinkedList<Integer>(result);
				currResult.add(node.val);
				results.add(currResult);
			}
		}
		else{
			result.add(node.val);
			
			if(node.left != null){
				this.search(node.left, sum - node.val, result, results);
			}
			
			if(node.right != null){
				this.search(node.right, sum - node.val, result, results);
			}
			
			result.remove(result.size() - 1);
		}
	}
}
