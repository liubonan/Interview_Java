package sol;

public class Solution {

	/**
	 * Given two binary trees, write a function to check if they are equal or
	 * not.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode r1 = new TreeNode(1);
		r1.left = new TreeNode(2);
		r1.right = new TreeNode(3);
		TreeNode r2 = new TreeNode(1);
		r2.left = new TreeNode(2);
		r2.right = new TreeNode(4);
		System.out.print(new Solution().isSameTree(r1,r2));

	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(p == null && q == null){
        	return true;
        }
        else if(p == null || q == null){
        	return false;
        }
        else{
        	if(p.val == q.val)
        		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        	else
        		return false;
        }
    }

}
