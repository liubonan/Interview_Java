package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {
	public List<String> wordBreak(String s, Set<String> dict) {
        
		List<String> result = new LinkedList<String>();
		if(dict == null || s == null || s.length() == 0){
        	return result;
        }
		
		HashMap <String, List<String>> cache = new HashMap<String, List<String>>();
		return this.search(s, dict, cache);
    }
	
	private List<String> search(String s, Set<String> dict, HashMap<String, List<String>> cache){
		
		if(cache.containsKey(s)){
			return cache.get(s);
		}
		
		List<String> rst = new LinkedList<String>();
		for(int i = 1; i <= s.length(); i++){
			String prefix = s.substring(0, i);
			
			if(dict.contains(prefix)){
				if(i == s.length()){
					rst.add(prefix);
				}
				
				String suffix = s.substring(i);
				List<String> suffixRst = this.search(suffix, dict, cache);
				
				for(String suff : suffixRst){
					rst.add(prefix + " " + suff);
				}
			}
		}
		cache.put(s, rst);
		return rst;
	}
}
