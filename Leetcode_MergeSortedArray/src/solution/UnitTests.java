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
		
		int [] A = new int [10];
		A[0] = 2;
		A[1] = 7;
		A[2] = 8;
		
		int [] B = new int [] {
				1, 3, 7
		};
		
		sol.merge(A, 3, B, 3);
		
		assertEquals(1, A[0]);
		assertEquals(8, A[5]);
    }
}
