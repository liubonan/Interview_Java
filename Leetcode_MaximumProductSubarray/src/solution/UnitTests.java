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
			3,-1,4
		};
		
		assertEquals(4, sol.maxProduct(A));
    }
}
