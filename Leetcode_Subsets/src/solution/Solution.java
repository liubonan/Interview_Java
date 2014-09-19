package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		if(S == null || S.length == 0){
			return result;
		}
		
		Arrays.sort(S);
		
		result.add(new LinkedList<Integer>());
		result.addAll(this.search(S, result.get(0), 0));
		
		return result;
    }
	
	private List<List<Integer>> search(int[] S, List<Integer> subset, int pos){
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		
		for(int i = pos; i < S.length; i++){
			List<Integer> current = new LinkedList<Integer>(subset);
			current.add(S[i]);
			result.add(current);
			result.addAll(this.search(S, current, i + 1));
		}
		
		return result;
	}

}
