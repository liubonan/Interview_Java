package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<String>> partition(String s) {
		List<List<String>> results = new LinkedList<List<String>>();
		if(s == null || s.length() == 0){
			return results;
		}
		
		boolean[][] isValid = this.getValidationArray(s);
		this.search(s, isValid, new LinkedList<String>(), 0, results);
		
		return results;
    }
	
	private void search(
			String s, 
			boolean[][] isValid, 
			List<String> result, 
			int index, 
			List<List<String>> results){
		
		if(index == s.length()){
			results.add(new LinkedList<String>(result));
			return;
		}
		
		for(int i = index + 1; i <= s.length(); i++){
			if(isValid[index][i]){
				result.add(s.substring(index, i));
				this.search(s, isValid, result, i, results);
				result.remove(result.size() - 1);
			}
		}
	}
	
	private boolean[][] getValidationArray(String s){
		boolean[][] isValid = new boolean[s.length() + 1][s.length() + 1];
		
		for (int i = 0; i < s.length() + 1; i++) {
			for (int j = 0; j <= i; j++) {
				isValid[i][j] = false;
			}

			if (i + 1 < s.length() + 1) {
				isValid[i][i + 1] = true;
			}

			if (i + 2 < s.length() + 1) {
				isValid[i][i + 2] = s.charAt(i) == s.charAt(i + 1);
			}
		}
		
		for (int j = 3; j < s.length() + 1; j++) {
			for (int i = 0; i < j - 2; i++) {
				isValid[i][j] = isValid[i + 1][j - 1]
						&& s.charAt(i) == s.charAt(j - 1);
			}
		}
		
		return isValid;
	}
}
