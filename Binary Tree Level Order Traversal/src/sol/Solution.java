package sol;

import java.util.ArrayList;

import java.util.LinkedList;

import java.util.Queue;

public class Solution {

	/**
	 * Given a binary tree, return the level order traversal of its 
	 * nodes' values. (ie, from left to right, level by level).
	 * For example:
	 * Given binary tree {3,9,20,#,#,15,7},return its level order 
	 * traversal as:[[3],[9,20],[15,7]]
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
		
		ArrayList<ArrayList<Integer>> r = new Solution().levelOrder(root);
		for(ArrayList<Integer> list : r){
			for(int i : list){
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root == null){
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			return result;
    	}
		
		Queue<TreeNodeLevel> q = new LinkedList<TreeNodeLevel>();		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		
		q.add(new TreeNodeLevel(root,0));
		int current_level = q.peek().level;
		
		while(!q.isEmpty()){
			ArrayList<Integer> current_nodes = new ArrayList<Integer>();
			while(!q.isEmpty() && q.peek().level == current_level){
				TreeNode current = q.remove().node;
				if(current.left != null)
					q.add(new TreeNodeLevel(current.left,current_level+1));
				if(current.right != null)
					q.add(new TreeNodeLevel(current.right,current_level+1));
				current_nodes.add(current.val);
			}
			if(!q.isEmpty())
				current_level = q.peek().level;
			result.add(current_nodes);
		}
		
		return result;
		
        
    }

}
