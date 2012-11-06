package sol;

public class Solution {

	/**
	 * Given a binary tree, determine if it is height-balanced.
	 *For this problem, a height-balanced binary tree is defined as a binary 
	 *tree in which the depth of the two subtrees of every node never differ 
	 *by more than 1.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		
		System.out.print(new Solution().isBalanced(root));
	}
	
	public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		if(height(root) == -1)
			return false;
		else
			return true;
    }
	
	public int height(TreeNode n){
		int left_b, right_b;
		
		if(n == null){
			return 0;
		}
		else{
			left_b = height(n.left);
			right_b = height(n.right);

			if (left_b == -1 || right_b == -1) {
				return -1;
			} else if (Math.abs(left_b - right_b) <= 1) {
				return Math.max(left_b, right_b)+1;
			} else {
				return -1;
			}
		}
	}

}
