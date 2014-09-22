package solution;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		
		if(num == null){
			return results;
		}
		
		this.search(new LinkedList<Integer>(), num, 0, results);
		
        return results;
    }
	
	private void search(List<Integer> father, int[] num, int pos, List<List<Integer>> results){
		for (int j = pos; j < num.length; j++) {
			for (int i = 0; i <= father.size(); i++) {
				List<Integer> current = new LinkedList<Integer>(father);
				current.add(i, num[pos]);
				if (current.size() == num.length) {
					results.add(current);
				} else {
					this.search(current, num, j + 1, results);
				}
			}
		}
	}
}
