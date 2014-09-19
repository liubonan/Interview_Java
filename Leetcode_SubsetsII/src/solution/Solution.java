package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsetsWithDup(int[] num) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		if(num == null){
			return result;
		}
		
		Arrays.sort(num);
		List<Integer> root = new LinkedList<Integer>();
		result.add(root);
		result.addAll(this.search(num, root, 0));
		
		return result;
    }
	
	private List<List<Integer>> search(int[] num, List<Integer> preSet, int pos){
		
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		for(int i = pos; i < num.length; i++){
			if(i != pos && num[i] == num[i - 1]){
				continue;
			}
			
			List<Integer> current = new LinkedList<Integer>(preSet);
			current.add(num[i]);
			result.add(current);
			result.addAll(this.search(num, current, i + 1));
		}
		
		return result;
	}

}
