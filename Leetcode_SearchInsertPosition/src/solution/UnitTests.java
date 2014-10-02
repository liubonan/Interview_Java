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
				1,3,5,6
		};
		
		
		assertEquals(2, sol.searchInsert(A, 5));
		assertEquals(1, sol.searchInsert(A, 2));
    }
}
