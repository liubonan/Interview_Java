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
		
		int [] A = new int [] {2, 7, 11, 15};
		
		assertEquals(1, sol.twoSum(A, 9)[0]);
		assertEquals(2, sol.twoSum(A, 9)[1]);

    }
}
