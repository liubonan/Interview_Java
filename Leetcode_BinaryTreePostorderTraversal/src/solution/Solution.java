package solution;

import java.util.*;

public class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		
		if(root == null){
			return result;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode prev = null;
		
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode current = stack.peek();
			TreeNode right= current.right;
			TreeNode left = current.left;
			
			if(prev == null || prev.left == current || prev.right == current){
				if(left != null){
					stack.push(left);
				}
				else if(right != null){
					stack.push(right);
				}
			}
			else if(current.left == prev){
				if(right != null){
					stack.push(right);
				}
			}
			else{
				result.add(current.val);
				stack.pop();
			}
			
			prev = current;
		}
		
		return result;
    }
}
