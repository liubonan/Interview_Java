package sol;

public class Solution {

	/**
	 * Populate each next pointer to point to its next right node. If there is
	 * no next right node, the next pointer should be set to NULL.
	 * 
	 * Initially, all next pointers are set to NULL.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);
		root.left.left = new TreeLinkNode(4);
		root.left.right = new TreeLinkNode(5);
		root.right.left = new TreeLinkNode(6);
		root.right.right = new TreeLinkNode(7);
		
		new Solution().connect(root);
		root = root.left.left;
		while(root != null){
			System.out.println(root.val);
			root = root.next;
		}
	}
	
	public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
        	return;
        TreeLinkNode curr = root;
        TreeLinkNode next_level = curr.left;
        
        while(curr != null && curr.left != null && curr.right != null){
        	curr.left.next = curr.right;
        	if(curr.next != null){
        		curr.right.next = curr.next.left;
        		curr = curr.next;
        	}
        	else{
        		curr = next_level;
        		if(curr != null)
        			next_level = curr.left;
        	}
        }
        
    }

}
