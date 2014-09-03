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
		assertEquals("blue is sky the", sol.reverseWords(" the  sky is blue "));

    }

}
