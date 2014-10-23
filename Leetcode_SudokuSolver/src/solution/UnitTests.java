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
		
		char[][] board = new char[][]{
				"..9748...".toCharArray(),
				"7........".toCharArray(),
				".2.1.9...".toCharArray(),
				"..7...24.".toCharArray(),
				".64.1.59.".toCharArray(),
				".98...3..".toCharArray(),
				"...8.3.2.".toCharArray(),
				"........6".toCharArray(),
				"...2759..".toCharArray()
		};
		
		sol.solveSudoku(board);
		
		for(char[] row : board){
			System.out.println(row);
		}
    }
}
