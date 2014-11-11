package sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	/**
	 * Given a digit string, return all possible letter combinations 
	 * that the number could represent.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		ArrayList<String> r = new Solution().letterCombinations(s);
		
		for(String ss : r)
			System.out.println(ss);
		
	}
	
	public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(digits == null || digits.length() == 0){
			ArrayList<String> r = new ArrayList<String>();
			r.add("");
			return r;			
		}
			
		
		String [] map = {"","","abc","def","ghi","jkl",
				"mno","pqrs","tuv","wxyz"};
		
		Queue<StringBuffer> q = new LinkedList<StringBuffer>();
		
		
		
		for(int i = 0; i < digits.length(); i++){
			if(q.isEmpty()){
				String mapping = map[digits.charAt(i)-'0'];
				for(int j = 0; j < mapping.length();j++){
					StringBuffer sb = new StringBuffer();
					q.add(sb.append(mapping.charAt(j)));
				}
			}
			else{
				int length = q.peek().length();
				
				StringBuffer current = q.peek();
				
				while(current.length() == length){
					current = q.remove();
					String mapping = map[digits.charAt(i)-'0'];
					for(int j = 0; j < mapping.length();j++){
						q.add(new StringBuffer(current).append(mapping.charAt(j)));
					}
					current = q.peek();
				}
			}		
			
		}
		
		ArrayList<String> r = new ArrayList<String>();
		
		while(!q.isEmpty()){
			r.add(q.remove().toString());
		}
		
		return r;
        
    }

}
