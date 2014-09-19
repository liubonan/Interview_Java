package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	private List<List<Integer>> result = new LinkedList<List<Integer>>();
	
	public List<List<Integer>> combine(int n, int k) {
		if(n <= 0 || k < 0){
			return this.result;
		}
		
		if(k == 0){
			result.add(new LinkedList<Integer>());
			return result;
		}
		
		this.search(n, k, 1, new LinkedList<Integer>());
		
		return this.result;
    }
	
	private void search(int n, int k, int currentNumber, List<Integer> preCombination){
		
		for(int i = currentNumber; i <= n; i++){
			if(preCombination.size() == k - 1){
				List<Integer> current = new LinkedList<Integer>(preCombination);
				current.add(i);
				this.result.add(current);
			}
			else{
				preCombination.add(i);
				this.search(n, k, i + 1, preCombination);
				preCombination.remove(preCombination.size() - 1);
			}
		}
	}

}
