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
				10,1,2,7,6,1,5
		};
		
		for(List<Integer> rst : sol.combinationSum2(A, 8)){
			System.out.println(rst);
		}
		
		assertEquals(4, sol.combinationSum2(A, 8).size());
    }
}
