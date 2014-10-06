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
		
		RandomListNode head1 = new RandomListNode(1);
		head1.next = new RandomListNode(2);
		head1.random = head1;
		head1.next.random = head1;
		
		assertEquals(1, sol.copyRandomList(head1).random.label);

    }
}
