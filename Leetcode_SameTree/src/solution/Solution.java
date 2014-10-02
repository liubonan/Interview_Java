package solution;

public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        return this.helper(p, q);
    }
	
	private boolean helper(TreeNode p, TreeNode q){
		if(p == null && q == null){
			return true;
		}
		
		if(p != null && q != null){
			return p.val == q.val &&
					helper(p.left, q.left) &&
					helper(p.right, q.right);
		}
		
		return false;
	}
}
