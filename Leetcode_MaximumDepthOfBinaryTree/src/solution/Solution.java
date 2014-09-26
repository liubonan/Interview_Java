package solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public int maxDepth(TreeNode root) {
		
		if(root == null){
			return 0;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		int depth = 0;
		
		while(!queue.isEmpty()){
			int size = queue.size();
			
			for(int i = 0; i < size; i++){
				TreeNode current = queue.remove();
				
				if(current.left != null){
					queue.add(current.left);
				}
				
				if(current.right != null){
					queue.add(current.right);
				}
			}
			
			depth++;
		}
		
        return depth;
    }
}
