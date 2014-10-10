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
		
		int [] A = new int [] {
				-1, 0, 1, 2, -1, -4,
		};
		assertEquals(2, sol.threeSum(A).size());
		
		assertEquals(-1, (int)sol.threeSum(A).get(1).get(0));
		assertEquals(0, (int)sol.threeSum(A).get(1).get(1));
		assertEquals(1, (int)sol.threeSum(A).get(1).get(2));
		
		assertEquals(-1, (int)sol.threeSum(A).get(0).get(0));
		assertEquals(-1, (int)sol.threeSum(A).get(0).get(1));
		assertEquals(2, (int)sol.threeSum(A).get(0).get(2));

    }
}
