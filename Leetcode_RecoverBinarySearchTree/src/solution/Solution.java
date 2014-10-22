package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	private TreeNode prev = new TreeNode(Integer.MIN_VALUE);
	private List<TreeNode> results = new ArrayList<TreeNode>(2);
	public void recoverTree(TreeNode root) {
        this.search(root);
        int temp = results.get(0).val;
        results.get(0).val = results.get(1).val;
        results.get(1).val = temp;
    }
	
	private void search(TreeNode node){
		if(node == null){
			return;
		}
		
		this.search(node.left);
		if(this.prev.val > node.val){
			if(results.size() == 0){
				results.add(prev);
				results.add(node);
			}
			else {
				results.set(1, node);
			}
		}
		this.prev = node;
		this.search(node.right);
	}
}
