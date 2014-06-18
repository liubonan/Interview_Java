package Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {
	
	@Test
    public void possitive() {
		assertEquals(true, Solution.Solution("abcdeafg"));
    }
	
	@Test
    public void negative() {
		assertEquals(false, Solution.Solution("abcdefg"));
    }

}
