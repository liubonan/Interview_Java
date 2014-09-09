package solution;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int sumNumbers(TreeNode root) {
		if(root == null){
			return 0;
		}
		
		return this.getSumOfSubTree(root, 0);
    }
	
	private int getSumOfSubTree(TreeNode node, int pathValue){
		int nodeValue = pathValue * 10 + node.val;
		
		if(node.left == null && node.right == null){
			return nodeValue;
		}

		int result = 0;
		
		if(node.left != null){
			result += this.getSumOfSubTree(node.left, nodeValue);
		}
		
		if(node.right != null){
			result += this.getSumOfSubTree(node.right, nodeValue);
		}
		
		return result;
	}
}
