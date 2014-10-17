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
		
		char[][] board = new char[][]{
				"....5..1.".toCharArray(),
				".4.3.....".toCharArray(),
				".....3..1".toCharArray(),
				"8......2.".toCharArray(),
				"..2.7....".toCharArray(),
				".15......".toCharArray(),
				".....2...".toCharArray(),
				".2.9.....".toCharArray(),
				"..4......".toCharArray()
		};
		
		assertFalse(sol.isValidSudoku(board));
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
