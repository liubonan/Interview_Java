package sol;

public class Solution {

	/**
	 * Follow up for problem "Populating Next Right Pointers in Each Node".
	 * 
	 * What if the given tree could be any binary tree? Would your previous
	 * solution still work?
	 * 
	 * Note:
	 * 
	 * You may only use constant extra space.
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
        
    }
	
	public void con(TreeLinkNode root, TreeLinkNode tail){
		
	}

}
