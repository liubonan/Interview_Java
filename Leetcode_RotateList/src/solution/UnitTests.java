package solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		
		assertEquals("2 1 ", output(sol.rotateRight(head1, 3)));
    }
	
	private String output(ListNode i){
		StringBuilder sb = new StringBuilder();
		while(i != null){
			sb.append(i.val);
			sb.append(' ');
			i = i.next;
		}
		
		return sb.toString();
	}
}
