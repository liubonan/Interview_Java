package solution;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		List<List<Integer>> triangle = new LinkedList<List<Integer>>();
		
		triangle.add(new LinkedList<Integer>(Arrays.asList(new Integer[]{2})));
		triangle.add(new LinkedList<Integer>(Arrays.asList(new Integer[]{3,4})));
		triangle.add(new LinkedList<Integer>(Arrays.asList(new Integer[]{6,5,7})));
		triangle.add(new LinkedList<Integer>(Arrays.asList(new Integer[]{4,1,8,3})));
		
		assertEquals(11, sol.minimumTotal(triangle));

    }
}
