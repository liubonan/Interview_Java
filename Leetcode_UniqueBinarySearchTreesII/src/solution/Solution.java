package solution;

import java.util.*;

public class Solution {
	public List<TreeNode> generateTrees(int n) {
        return this.search(1, n);
    }
	
	private List<TreeNode> search(int start, int end){
		List<TreeNode> result = new LinkedList<TreeNode>();
		
		if(start > end){
			result.add(null);
			return result;
		}
		
		for(int i = start; i <= end; i++){
			List<TreeNode> leftSub = this.search(start, i - 1);
			List<TreeNode> rightSub = this.search(i + 1, end);
			
			for(TreeNode left : leftSub){
				for(TreeNode right : rightSub){
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					result.add(root);
				}
			}
		}
		
		return result;
	}
}
