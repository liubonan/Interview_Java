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

		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		UndirectedGraphNode node3 = new UndirectedGraphNode(3);
		UndirectedGraphNode node4 = new UndirectedGraphNode(4);
		
		node1.neighbors.add(node2);
		node2.neighbors.add(node1);
		node1.neighbors.add(node4);
		node4.neighbors.add(node1);
		node4.neighbors.add(node2);
		node2.neighbors.add(node4);
		
		assertEquals(2, sol.cloneGraph(node1).neighbors.size());
    }
}
