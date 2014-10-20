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
		
		List<TreeNode> root = sol.generateTrees(3);
		
		for(TreeNode rst : root){
			System.out.println(this.output(rst));
		}

    }
	
	private LinkedList<String> output(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		LinkedList<String> vals = new LinkedList<String>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode current = queue.remove();
			
			if(current == null){
				vals.add("#");
			}
			else{
				vals.add(String.valueOf(current.val));
				queue.add(current.left);
				queue.add(current.right);
			}
		}
		
		return vals;
	}
	
//	private String output(ListNode i){
//		StringBuilder sb = new StringBuilder();
//		while(i != null){
//			sb.append(i.val);
//			sb.append(' ');
//			i = i.next;
//		}
//		
//		return sb.toString();
//	}
}
