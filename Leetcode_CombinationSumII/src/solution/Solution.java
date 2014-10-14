package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
			
			if(i != index && candidates[i] == candidates[i - 1]){
				continue;
			}
			
			result.add(candidates[i]);
			this.search(candidates, target - candidates[i], i + 1, result, results);
			result.remove(result.size() - 1);
		}
	}
}
