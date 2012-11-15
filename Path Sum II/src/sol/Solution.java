package sol;

import java.util.ArrayList;

public class Solution {

	/**
	 * Given a binary tree and a sum, find all root-to-leaf paths where each
	 * path's sum equals the given sum.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right= new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		
		System.out.println(new Solution().pathSum(root, 22));
	}
	
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root == null)
			return new ArrayList<ArrayList<Integer>>();
		
		ArrayList<ArrayList<Integer>> result = path(root, sum);			
		
		return result == null? new ArrayList<ArrayList<Integer>>() : result;
    }
	
	public ArrayList<ArrayList<Integer>> path(TreeNode root, int sum){
		if(root.left == null && root.right == null){
			if (sum == root.val){
				ArrayList<ArrayList<Integer>> rs = new ArrayList<ArrayList<Integer>>();
				ArrayList<Integer> r = new ArrayList<Integer>();
				r.add(root.val);
				rs.add(r);
				return rs;
			}
			else{
				return null;
			}
		}
		else{
			ArrayList<ArrayList<Integer>> l = null;
			if(root.left != null){
				l = path(root.left,sum-root.val);
			}
			ArrayList<ArrayList<Integer>> r = null;
			if(root.right != null){
				r = path(root.right,sum-root.val);
			}
			
			if(l != null && r != null){
				l.addAll(r);
				for(ArrayList<Integer> em : l)
					em.add(0, root.val);
				return l;
			}
			else if(l != null){
				for(ArrayList<Integer> em : l)
					em.add(0, root.val);
				return l;
			}
			else if(r != null){
				for(ArrayList<Integer> em : r)
					em.add(0, root.val);
				return r;
			}
			else{
				return null;
			}

								
		}
	}

}
