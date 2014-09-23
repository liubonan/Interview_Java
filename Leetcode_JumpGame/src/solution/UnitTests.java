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
		
		int [] A = new int []{
				2,3,1,1,4
		};
		
		
		assertTrue(sol.canJump(A));
		
		A = new int []{
				3,2,1,0,4
		};
		
		assertFalse(sol.canJump(A));
    }
}
