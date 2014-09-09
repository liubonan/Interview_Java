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
		
		char[][] A = new char[][] {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		
		assertTrue(sol.exist(A, "ABCCED"));
		assertTrue(sol.exist(A, "SEE"));
		assertFalse(sol.exist(A, "ABCB"));

    }
}
