package solution;

import java.util.*;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if(root == null){
			return true;
		}
		
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		
		q1.offer(root.left);
		q2.offer(root.right);
		
		while(!q1.isEmpty() && !q2.isEmpty()){
			int size1 = q1.size();
			int size2 = q2.size();
			
			if(size1 != size2){
				return false;
			}
			
			for(int i = 0; i < size1; i++){
				TreeNode n1 = q1.poll();
				TreeNode n2 = q2.poll();
				
				if(n1 == null && n2 == null){
					continue;
				}
				
				if(n1 == null || n2 == null || n1.val != n2.val){
					return false;
				}
				
				q1.offer(n1.left);
				q1.offer(n1.right);
				q2.offer(n2.right);
				q2.offer(n2.left);
			}
		}
		
		if(!q1.isEmpty() || !q2.isEmpty()){
			return false;
		}
		
		return true;
    }
}
