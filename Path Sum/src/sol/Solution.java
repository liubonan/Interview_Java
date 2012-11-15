package sol;

public class Solution {

	/**
	 * Given a binary tree and a sum, determine if the tree has 
	 * a root-to-leaf path such that adding up all the values along 
	 * the path equals the given sum.
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
		
		System.out.println(new Solution().hasPathSum(root, 10));

	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root == null)
			return false;
		else{
			return sum(root,sum);
		}
			
        
    }
	
	public boolean sum(TreeNode root, int sum){
		if(root.left == null && root.right == null){
			if (sum == root.val)
				return true;
			else
				return false;
		}
		else{
			boolean l = false;
			if(root.left != null)
				l = sum(root.left,sum-root.val);
			boolean r = false;
			if(root.right != null)
				r = sum(root.right,sum-root.val);
			return  l||r; 
								
		}
	}
	
	
}
	
	


