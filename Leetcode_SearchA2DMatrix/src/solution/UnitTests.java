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
				{1, 3, 5, 7},
				{10, 14, 16, 26},
				{34, 41, 47, 57}
		};
		
		assertTrue(sol.searchMatrix(matrix, 3));
    }
}
