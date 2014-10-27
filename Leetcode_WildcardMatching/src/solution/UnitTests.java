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
		
		assertTrue(sol.isMatch("ab", "?*"));
		assertTrue(sol.isMatch("abcdef", "a?cd*"));
		assertFalse(sol.isMatch("abcdef", "a?cd*g"));
    }
}
