package solution;

import java.util.*;

public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
        	return false;
        }
        
        return this.search(root, sum);
    }
	
	private boolean search(TreeNode node, int sum){
		if(node.left == null && node.right == null){
			return sum == node.val;
		}
		else if(node.left == null){
			return this.search(node.right, sum - node.val);
		}
		else if(node.right == null){
			return this.search(node.left, sum - node.val);
		}
		else{
			return this.search(node.right, sum - node.val) ||
					this.search(node.left, sum - node.val);	
		}
	}
}
