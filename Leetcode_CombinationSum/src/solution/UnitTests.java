package solution;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		int [] A = new int [] {
				2, 3, 6, 7
		};
		
		for(List<Integer> rst : sol.combinationSum(A, 7)){
			System.out.println(rst);
		}
		
		assertEquals(2, sol.combinationSum(A, 7).size());
    }
}
