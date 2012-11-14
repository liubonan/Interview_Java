package sol;

public class Solution {

	/**
	 * Given a binary tree, find its minimum depth.
	 * 
	 * The minimum depth is the number of nodes along the shortest path from the
	 * root node down to the nearest leaf node.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(1);
		t.right = new TreeNode(1);
		t.left.left = new TreeNode(1);
		t.left.left.left = new TreeNode(1);
		System.out.println(new Solution().minDepth(t));
	}
	
	public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root == null)
			return 0;
		
        return dep(root);
    }
	
	public int dep(TreeNode root){
		if(root.left == null && root.right == null){
			return 1;
		}
		else{
			int left = Integer.MAX_VALUE;
			if(root.left != null)
				left = dep(root.left);
			int right = Integer.MAX_VALUE;
			if(root.right != null)
				right = dep(root.right);
			return Math.min(left, right)+1;	
		}
	}
}


