package solution;

import java.util.*;

public class Solution {
	public TreeNode sortedArrayToBST(int[] num) {
        if(num == null || num.length == 0){
        	return null;
        }
        
        return this.search(num, 0, num.length - 1);
    }
	
	private TreeNode search(int[] num, int begin, int end){
		if(begin > end){
			return null;
		}
		
		int mid = begin + (end - begin) / 2;
		
		TreeNode root = new TreeNode(num[mid]);
		root.left = this.search(num, begin, mid - 1);
		root.right = this.search(num, mid + 1, end);
		return root;
	}
}
