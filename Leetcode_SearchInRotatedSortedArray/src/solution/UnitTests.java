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
				5,6,7,0,1,2,4
		};
		
		
		assertEquals(2, sol.search(A, 7));
		assertEquals(-1, sol.search(A, 8));
    }
}
