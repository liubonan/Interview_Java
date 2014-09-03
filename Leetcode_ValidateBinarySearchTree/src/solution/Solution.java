package solution;

public class Solution {
	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean isValidBST(TreeNode root, int minVal, int maxVal){
		
		if(root == null){
			return true;
		}
		
		return root.val < maxVal &&
				root.val > minVal &&
				isValidBST(root.left, minVal, root.val) &&
				isValidBST(root.right, root.val, maxVal);
	}
}
