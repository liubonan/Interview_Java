package solution;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {
	
	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		int [] A = new int [] {
				5, 7, 7, 8, 8, 10
		};
		
		assertEquals(3, sol.searchRange(A, 8)[0]);
		assertEquals(4, sol.searchRange(A, 8)[1]);
    }

}
