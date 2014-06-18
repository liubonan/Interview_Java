package Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {
	
	@Test
    public void thisAlwaysPasses() {
		
		assertEquals(-1, Sol.func(0));

    }
	
	@Test
    public void thisIsIgnored() {
		assertEquals(1, Sol.func(0));
    }

}
