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
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(5);
		head.next.next.next = new ListNode(7);
		
		ListNode expected = new ListNode(3);
		expected.next = new ListNode(1);
		expected.next.next = new ListNode(7);
		expected.next.next.next = new ListNode(5);
		
		assertEquals(output(expected), output(sol.swapPairs(head)));

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
