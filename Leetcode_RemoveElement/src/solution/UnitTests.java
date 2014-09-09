package solution;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {
	
	@Test
    public void thisAlwaysPasses() {
		int[] A = new int[] {4,5,5,6,7,5,9};
		Solution sol = new Solution();
		assertEquals(4, sol.removeElement(A, 5));

    }

}
