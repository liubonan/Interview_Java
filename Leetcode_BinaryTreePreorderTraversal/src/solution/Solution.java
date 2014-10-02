package solution;

import java.util.*;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		
		if(root == null){
			return result;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		stack.add(root);
		
		while(!stack.isEmpty()){
			TreeNode current = stack.pop();
			TreeNode right= current.right;
			TreeNode left = current.left;
			
			result.add(current.val);
			
			if(right != null){
				stack.push(right);
			}
			
			if(left != null){
				stack.push(left);
			}
			
		}
		
		return result;
    }
}
