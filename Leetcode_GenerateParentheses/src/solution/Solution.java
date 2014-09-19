package solution;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		if(n == 0){
			return new LinkedList<String>();
		}
		
		return this.search(new StringBuilder(), n, n);
    }
	
	private List<String> search(StringBuilder current, int left, int right){
		List<String> result = new LinkedList<String>();
		
		if(left == right && left == 0){
			result.add(current.toString());
			return result;
		}
		
		if(left > right){
			return result;
		}
		
		if(left != 0){
			current.append("(");
			result.addAll(this.search(current, left - 1, right));
			current.delete(current.length() - 1, current.length());
		}
		
		if(right != 0){
			current.append(")");
			result.addAll(this.search(current, left, right - 1));
			current.delete(current.length() - 1, current.length());
		}
		
		return result;
	}
}
