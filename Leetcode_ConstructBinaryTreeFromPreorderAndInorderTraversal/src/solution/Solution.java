package solution;

import java.util.*;

public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder == null || preorder == null){
        	return null;
        }
        
        return this.search(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }
	
	private TreeNode search(
			int[] inorder, 
			int[] preorder, 
			int beginIn, 
			int endIn,
			int beginPre, 
			int endPre){
		
		if(beginIn > endIn || beginPre > endPre){
			return null;
		}
		
		int posIn = -1;
		for(int i = beginIn; i <= endIn; i++){
			if(preorder[beginPre] == inorder[i]){
				posIn = i;
				break;
			}
		}
		
		TreeNode root = new TreeNode(preorder[beginPre]);
		
		root.left = this.search(inorder, preorder, beginIn, posIn - 1, beginPre + 1, beginPre + posIn - beginIn);
		root.right = this.search(inorder, preorder, posIn + 1, endIn, beginPre + posIn - beginIn + 1, endPre);
		
		return root;
	}
}
