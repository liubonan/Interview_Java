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
		
		assertTrue(sol.isInterleave("ab", "cd", "acbd"));
		assertFalse(sol.isInterleave("ab", "cd", "abdc"));
		assertTrue(sol.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
		assertFalse(sol.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
