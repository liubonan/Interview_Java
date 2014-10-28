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
		
		String [] A = new String []{
				"This", "is", "an", "example", "of", "text", "justification."
		};
		
		for(String rst : sol.fullJustify(A, 16)){
			System.out.println(rst);
		}
		
		A = new String []{
				""
		};
		
		for(String rst : sol.fullJustify(A, 0)){
			System.out.println(rst);
		}
    }
}
