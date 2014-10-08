package solution;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		int [][] A = new int [][]{
				{9,1,9},
				{9,1,9},
				{9,1,9}
		};
		
		
		assertEquals(21, sol.minPathSum(A));
    }
}
