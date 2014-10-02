package solution;

import java.util.*;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
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
			
			if(left == null && right == null){
				result.add(current.val);
				continue;
			}
			
			if(right != null){
				stack.push(right);
			}
			
			TreeNode dummy = new TreeNode(current.val);
			stack.push(dummy);
			
			if(left != null){
				stack.push(left);
			}
			
		}
		
		return result;
    }
}
