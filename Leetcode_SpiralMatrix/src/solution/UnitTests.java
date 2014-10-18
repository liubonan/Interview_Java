package solution;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		int[][] matrix = new int[][]{
				{1, 2, 0, 3},
				{0, 0, 5, 6},
				{4, 1, 7, 7}
		};
		
		System.out.println(sol.spiralOrder(matrix));
    }

	private boolean matrixEquals(int[][] matrix, int[][] expected) {
		if(matrix == null && expected == null){
			return true;
		}
		
		if ((matrix == null && expected != null) || 
			(matrix != null && expected == null) ||
			(matrix.length != expected.length) || 
			(matrix[0].length != expected[0].length)) {
			return false;
		}
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] != expected[i][j]){
					return false;
				}
			}
		}
		
		return true;
	}
	
//	private LinkedList<String> output(TreeNode root) {
//		Queue<TreeNode> queue = new LinkedList<TreeNode>();
//		LinkedList<String> vals = new LinkedList<String>();
//
//		queue.add(root);
//
//		while (!queue.isEmpty()) {
//			TreeNode current = queue.remove();
//
//			if (current == null) {
//				vals.add("#");
//			} else {
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
