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
		
//		int [] A = new int [] {
//				1, 2, 3
//		};
		
		assertEquals(6, sol.combine(4, 2).size());
    }
}
