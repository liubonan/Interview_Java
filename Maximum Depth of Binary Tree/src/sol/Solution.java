package sol;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	/**
	 * Given a binary tree, find its maximum depth.
	 * 
	 * The maximum depth is the number of nodes along the longest path from the
	 * root node down to the farthest leaf node.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(1);
		t.right = new TreeNode(1);
		t.left.left = new TreeNode(1);
		t.left.left.left = new TreeNode(1);
		System.out.println(new Solution().maxDepth(t));
	}
	
	public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
        	return 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
        	count ++;
        	int size = q.size();
        	TreeNode curr;
        	for(int i = 0; i < size; i++){
        		curr = q.remove();
        		if(curr.left != null)
        			q.add(curr.left);
        		if(curr.right != null)
        			q.add(curr.right);
        	}
        }
        return count;
	}
}

