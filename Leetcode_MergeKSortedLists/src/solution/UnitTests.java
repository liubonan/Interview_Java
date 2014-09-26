package solution;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UnitTests {

	@Test
    public void thisAlwaysPasses() {
		Solution sol = new Solution();
		
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(5);
		
		ListNode head2 = new ListNode(2);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(4);
		head2.next.next = new ListNode(6);
		
		ListNode expected = new ListNode(1);
		expected.next = new ListNode(2);
		expected.next.next = new ListNode(2);
		expected.next.next.next = new ListNode(3);
		expected.next.next.next.next = new ListNode(4);
		expected.next.next.next.next.next = new ListNode(5);
		expected.next.next.next.next.next.next = new ListNode(6);
		
		List<ListNode> lists = Arrays.asList(new ListNode[] {head1, head2});
		
		assertEquals(output(expected), output(sol.mergeKLists(lists)));
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
