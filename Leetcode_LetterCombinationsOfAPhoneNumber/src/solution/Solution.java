package solution;

import java.util.*;

public class Solution {
	public List<String> letterCombinations(String digits) {
		if(digits == null){
			return new LinkedList<String>();
		}
		
        String[] map = new String[]{
        	"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        
        List<String> results = new LinkedList<String>();
        this.search(digits, 0, new StringBuilder(), map, results);
        return results;
    }
	
	private void search(String digits, int index, StringBuilder result, String[] map, List<String> results){
		if(index == digits.length()){
			results.add(result.toString());
			return;
		}
		
		int curr = digits.charAt(index) - '0';
		
		for(int i = 0; i < map[curr].length(); i++){
			result.append(map[curr].charAt(i));
			this.search(digits, index + 1, result, map, results);
			result.deleteCharAt(result.length() - 1);
		}
	}
}
