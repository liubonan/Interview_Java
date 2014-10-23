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
		
		Point [] A = new Point []{
				new Point(1,1),
				new Point(2,2),
				new Point(3,3),
				new Point(5,6),
				new Point(4,4)
		};
		
		assertEquals(4, sol.maxPoints(A));
    }
}
