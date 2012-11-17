package sol;

public class Solution {

	/**
	 * Given a binary tree, check whether it is a mirror of itself (ie,
	 * symmetric around its center).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(3);
		r.right = new TreeNode(3);
		r.left.left = new TreeNode(2);
		r.right.right = new TreeNode(2);
		System.out.print(new Solution().isSymmetric(r));
	}
	
	public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
        	return true;
        return isSymm(root.left,root.right);
    }
	
	public boolean isSymm(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null){
			return true;
		}
		else if(t1 == null || t2 == null){
			return false;
		}
		else{
			return (t1.val == t2.val)&&isSymm(t1.left,t2.right)&&isSymm(t1.right,t2.left);
		}
	}

}
