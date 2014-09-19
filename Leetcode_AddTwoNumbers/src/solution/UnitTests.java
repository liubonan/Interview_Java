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
		
		ListNode head1 = new ListNode(2);
		head1.next = new ListNode(4);
		head1.next.next = new ListNode(3);
		
		ListNode head2 = new ListNode(5);
		head2.next = new ListNode(6);
		head2.next.next = new ListNode(4);
		
		ListNode expected = new ListNode(7);
		expected.next = new ListNode(0);
		expected.next.next = new ListNode(8);
		
		assertEquals(output(expected), output(sol.addTwoNumbers(head1, head2)));

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
