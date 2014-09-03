package solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {
	
	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		assertEquals(1, sol.climbStairs(1));
		assertEquals(2, sol.climbStairs(2));
		assertEquals(3, sol.climbStairs(3));

    }

}
