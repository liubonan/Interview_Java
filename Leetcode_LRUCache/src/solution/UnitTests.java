package solution;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		LRUCache cache = new LRUCache(1);
		cache.set(2,1);
		cache.get(2);
		cache.set(3,2);
		cache.get(2);
		cache.get(3);
    }
}
