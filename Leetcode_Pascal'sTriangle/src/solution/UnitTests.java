package solution;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		for(List<Integer> rst : sol.generate(3)){
			System.out.println(rst);
		}
		
		assertEquals(3, sol.generate(3).get(2).size());
    }
}
