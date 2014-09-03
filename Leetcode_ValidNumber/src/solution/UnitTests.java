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
		
		List<String> testCases = new LinkedList<String>();
		
		testCases.add("-30");
		testCases.add(" 30 ");
		testCases.add("+30.90");
		testCases.add(" 30.87e2");
		testCases.add("30.87e-2 ");
		
		for(String s : testCases){
			assertTrue(sol.isNumber(s));
		}
		
		List<String> NegativeTestCases = new LinkedList<String>();
		
		testCases.add("-3.+0");
		testCases.add("30+-");
		testCases.add("+30.90a");
		testCases.add("30.87-e");
		testCases.add("30.8.7e-2");
		
		for(String s : NegativeTestCases){
			assertFalse(sol.isNumber(s));
		}

    }
//	
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
