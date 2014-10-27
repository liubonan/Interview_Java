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
		
		char [][] A = new char [][]{
				{'0','0','0','0'},
				{'0','1','1','1'},
				{'0','1','1','1'},
				{'0','1','0','0'}
		};
		
		assertEquals(6, sol.maximalRectangle(A));
		
		A = new char [][]{
				{'1'}
		};
		assertEquals(1, sol.maximalRectangle(A));
    }
}
