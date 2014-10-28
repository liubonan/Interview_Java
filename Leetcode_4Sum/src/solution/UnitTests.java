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
				1, 0, -1, 0, -2, 2
		};
		
		for(List<Integer> rst : sol.fourSum(A, 0)){
			System.out.println(rst);
		}

    }
}
