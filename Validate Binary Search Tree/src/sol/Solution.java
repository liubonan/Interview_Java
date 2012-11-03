package sol;

public class Solution {

	/**
	 * Given a binary tree, determine if it is a valid binary 
	 * search tree (BST).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(-1);
//		root.right = new TreeNode(3);
//		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(5);
//		root.right.left = new TreeNode(6);
//		root.right.right = new TreeNode(7);
		
		System.out.println(new Solution().isValidBST(root));

	}
	
	private int prev ;
	
	public boolean isValidBST(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		prev = Integer.MIN_VALUE;
		return bst(root);
		
	}
	
	public boolean bst(TreeNode root){
		if(root == null)
			return true;
		else{
			if (!bst(root.left))
				return false;

			if (prev >= root.val)
				return false;
			else
				prev = root.val;

			if (!bst(root.right))
				return false;

			return true;
		}
	}

}
