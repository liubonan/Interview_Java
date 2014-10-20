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
		
		assertEquals(1, sol.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, sol.lengthOfLongestSubstring("abcabcbb"));
    }
}
