package solution;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public String minWindow(String S, String T) {
        if(S == null || S.length() == 0 || T == null || T.length() == 0){
        	return "";
        }
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char c : T.toCharArray()){
        	if(map.containsKey(c)){
            	map.put(c, map.get(c) + 1);
        	}
        	else{
            	map.put(c, 1);
        	}
        }
        
        int diff = T.length();
        String min = null;
        int left = 0, right = 1;
        
        while(right <= S.length()){
			char curr = S.charAt(right - 1);
			if (map.containsKey(curr)) {
				map.put(curr, map.get(curr) - 1);
				
				if(map.get(curr) >= 0){
					diff--;
				}
			}

			while (left < right && diff == 0) {
				if (min == null || right - left < min.length()) {
					min = S.substring(left, right);
				}

				char lChar = S.charAt(left);
				if (map.containsKey(lChar)) {
					map.put(lChar, map.get(lChar) + 1);
					
					if(map.get(lChar) > 0){
						diff++;
					}
				}
				
				left++;
			}

			right++;
        }
        
        return min != null ? min : "";
    }
}
