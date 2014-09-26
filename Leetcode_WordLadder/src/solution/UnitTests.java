package solution;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		String [] A = new String []{
				"hot","dot","dog","lot","log"
		};
		
		Set<String> setA = new HashSet<String>();
		
		for(String s : A){
			setA.add(s);
		}
		
		
		assertEquals(5, sol.ladderLength("hit", "cog", setA));
    }
}
