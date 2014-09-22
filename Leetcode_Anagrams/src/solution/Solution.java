package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> anagrams(String[] strs) {
		
		List<String> results = new LinkedList<String>();
		
		if(strs == null){
			return results;
		}
		
		HashMap<List<Integer>, List<String>> hashMap = new HashMap<List<Integer>, List<String>>();
		
		for(String s : strs){
			List<Integer> count = Solution.getCharCount(s);
			
			if(!hashMap.containsKey(count)){
				hashMap.put(count, new LinkedList<String>());
			}
			
			hashMap.get(count).add(s);
		}
		
		for(List<Integer> i : hashMap.keySet()){
			if(hashMap.get(i).size() > 1){
				results.addAll(hashMap.get(i));
			}
		}
		
        return results;
    }
	
	private static List<Integer> getCharCount(String str){
		List<Integer> result = new ArrayList<Integer>(26);
		
		for(int i = 0; i < 26; i++){
			result.add(0);
		}
		
		for(char c : str.toCharArray()){
			result.set(c - 'a', result.get(c - 'a') + 1);
		}
		
		return result;
	}
}
