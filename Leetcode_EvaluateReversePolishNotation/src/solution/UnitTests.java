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
		
		String [] A = new String []{
				"4","-2","/","2","-3","-","-"
		};
		
		assertEquals(-7, sol.evalRPN(A));
    }
}
