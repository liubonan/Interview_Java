package sol;

import java.util.ArrayList;

public class Solution {

	/**
	 * Given n pairs of parentheses, write a function to generate all 
	 * combinations of well-formed parentheses.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new Solution().generateParenthesis(3);
		
		for(String s : array){
			System.out.println(s);
		}

	}
	
	public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<String> array = new ArrayList<String>();
		array.add("");
		return rec(array,n,n);
        
    }
	
	public ArrayList<String> rec(ArrayList<String> array, int left, int right){
		if(left > right){
			return new ArrayList<String>();
		}
		else if (left == right && left == 0)
			return array;
		else if (left < 0 || right < 0){
			return new ArrayList<String>();
		}
		else{
			ArrayList<String> left_array = new ArrayList<String>();
			ArrayList<String> right_array = new ArrayList<String>();
			
			for(int i = 0; i < array.size(); i++){
				String s = array.get(i);
				left_array.add(s+"(");
				right_array.add(s+")");
			}
			
			left_array = rec(left_array, left-1, right);
			right_array = rec(right_array, left, right-1);
			left_array.addAll(right_array);
			
			return left_array;
			
		}
	}

}
