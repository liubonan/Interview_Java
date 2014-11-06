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
		System.out.println(sol.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"}));
		System.out.println(sol.findSubstring("aaa", new String[] {"a", "a"}));
		System.out.println(sol.findSubstring("abaababbaba", new String[] {"ab","ba","ab","ba"}));
    }
}
