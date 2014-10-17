package solution;

import java.util.*;

public class Solution {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
        	return null;
        }
        
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = 
        		new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        
        List<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        int index = 0;
        
        queue.add(node);
        map.put(node, new UndirectedGraphNode(node.label));
        while(index < queue.size()){
        	UndirectedGraphNode curr = queue.get(index++);
			for (UndirectedGraphNode n : curr.neighbors) {
				if (!map.containsKey(n)) {
					map.put(n, new UndirectedGraphNode(n.label));
					queue.add(n);
				}
			}
        }
        
        for(int i = 0; i < index; i++){
        	UndirectedGraphNode curr = queue.get(i);
        	for(UndirectedGraphNode n : curr.neighbors){
            	map.get(curr).neighbors.add(map.get(n));
        	}
        }
        
        return map.get(node);
    }
}
