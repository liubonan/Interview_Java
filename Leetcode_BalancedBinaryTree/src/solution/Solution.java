package solution;

public class Solution {
	public boolean isBalanced(TreeNode root) {
        if(root == null){
        	return true;
        }
        
        if(this.search(root) == -1){
        	return false;
        }
        
        return true;
    }
	
	private int search(TreeNode node){
		if(node == null){
			return 0;
		}
		
		int left = this.search(node.left);
		int right = this.search(node.right);
		
		if(left == -1 || right == -1 || Math.abs(left - right) > 1){
			return -1;
		}
		
		return Math.max(left, right) + 1;
	}
}
