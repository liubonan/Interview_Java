package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		
		if(candidates == null){
        	return results;
        }
		
		Arrays.sort(candidates);
		this.search(candidates, target, 0, new LinkedList(), results);
		return results;
    }
	
	private void search(int[] candidates, int target, int index, List<Integer> result, List<List<Integer>> results){
		if(target == 0){
			results.add(new LinkedList<Integer>(result));
			return;
		}
		
		for(int i = index; i < candidates.length; i++){
			if(target - candidates[i] < 0){
				continue;
			}
			
			result.add(candidates[i]);
			this.search(candidates, target - candidates[i], i, result, results);
			result.remove(result.size() - 1);
		}
	}
}
