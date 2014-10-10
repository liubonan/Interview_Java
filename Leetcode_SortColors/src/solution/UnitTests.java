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
				2,0,1
		};
		
		sol.sortColors(A);
		assertEquals(0, A[0]);
		assertEquals(1, A[1]);
		assertEquals(2, A[2]);
    }
}
