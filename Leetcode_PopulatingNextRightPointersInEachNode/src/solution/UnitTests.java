package solution;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		TreeLinkNode root = new TreeLinkNode(3);
		
		root.left = new TreeLinkNode(1);
		root.right = new TreeLinkNode(5);
		sol.connect(root);
		
		assertEquals(root.left.next, root.right);
    }
	
//	private LinkedList<String> output(TreeNode root){
//		Queue<TreeNode> queue = new LinkedList<TreeNode>();
//		LinkedList<String> vals = new LinkedList<String>();
//		
//		queue.add(root);
//		
//		while(!queue.isEmpty()){
//			TreeNode current = queue.remove();
//			
//			if(current == null){
//				vals.add("#");
//			}
//			else{
//				vals.add(String.valueOf(current.val));
//				queue.add(current.left);
//				queue.add(current.right);
//			}
//		}
//		
//		return vals;
//	}
}
