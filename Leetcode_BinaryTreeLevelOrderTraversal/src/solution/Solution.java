package solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		if(root == null){
			return result;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			int levelNodeCount = queue.size();
			
			List<Integer> levelResult = new LinkedList<Integer>();
			
			for(int i = 0; i < levelNodeCount; i++){
				TreeNode current = queue.remove();
				levelResult.add(current.val);
				
				if(current.left != null){
					queue.add(current.left);
				}
				if(current.right != null){
					queue.add(current.right);
				}
			}
			
			result.add(levelResult);
		}
		
		return result;
    }
}
