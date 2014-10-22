package solution;

import java.util.*;

public class Solution {
	private int max = Integer.MIN_VALUE;
	
	public int maxPathSum(TreeNode root) {
        if(root == null){
        	return 0;
        }
        
        return Math.max(this.helper(root), this.max);
    }
	
	private int helper(TreeNode node){
		
		if(node == null){
			return 0;
		}
		
		int left = this.helper(node.left);
		int right = this.helper(node.right);
		int maxViaRoot = Math.max(0, left) + Math.max(0, right) + node.val;
		this.max = Math.max(this.max, maxViaRoot);
		
		return node.val + Math.max(0, Math.max(left, right));
	}
}
