package solution;

public class Solution {
	public void flatten(TreeNode root) {
        this.dfs(root);
    }
	
	private TreeNode dfs(TreeNode root){
		if(root == null){
			return null;
		}
		
		TreeNode leftTail = this.dfs(root.left);
		TreeNode rightTail = this.dfs(root.right);
		
		if(rightTail != null){
			rightTail.right = null;
		}
		
		if(leftTail != null){
			leftTail.right = root.right;
		}
		
		if(root.left != null){
			root.right = root.left;
			root.left = null;
		}
		return rightTail == null
				? leftTail == null ? root : leftTail 
				: rightTail;
	}
}
