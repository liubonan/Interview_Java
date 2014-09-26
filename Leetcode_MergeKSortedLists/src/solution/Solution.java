package solution;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
	Comparator<ListNode> listNodeComparator = new Comparator<ListNode>(){
		public int compare(ListNode l1, ListNode l2){
			return l1.val >= l2.val ? 1 : -1;
		}
	};
	
	public ListNode mergeKLists(List<ListNode> lists) {
        if(lists == null || lists.size() == 0){
        	return null;
        }
        
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), listNodeComparator);
        
        for(int i = 0; i < lists.size(); i++){
        	if(lists.get(i) != null){
        		heap.add(lists.get(i));
        	}
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while(!heap.isEmpty()){
        	ListNode node = heap.remove();
        	if(node.next != null){
        		heap.add(node.next);
        	}
        	
        	current.next = node;
        	current = current.next;
        }
        
        return dummy.next;
    }
}
