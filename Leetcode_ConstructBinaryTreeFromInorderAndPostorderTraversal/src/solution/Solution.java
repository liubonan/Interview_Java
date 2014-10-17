package solution;

import java.util.*;

public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null){
        	return null;
        }
        
        return this.search(inorder, postorder, 0, 0, inorder.length - 1, postorder.length - 1);
    }
	
	private TreeNode search(
			int[] inorder, 
			int[] postorder, 
			int beginIn, 
			int beginPost, 
			int endIn,
			int endPost){
		
		if(beginIn > endIn || beginPost > endPost){
			return null;
		}
		
		int posIn = -1;
		for(int i = beginIn; i <= endIn; i++){
			if(postorder[endPost] == inorder[i]){
				posIn = i;
				break;
			}
		}
		
		TreeNode root = new TreeNode(postorder[endPost]);
		
		root.left = this.search(inorder, postorder, beginIn, beginPost, posIn - 1, beginPost + posIn - beginIn - 1);
		root.right = this.search(inorder, postorder, posIn + 1, beginPost + posIn - beginIn, endIn, endPost - 1);
		
		return root;
	}
}
