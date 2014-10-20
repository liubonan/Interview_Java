package solution;

import java.util.HashSet;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
        	return 0;
        }
        
        int max = Integer.MIN_VALUE;
        int left = 0, right = 1;
        
        HashSet<Character> set = new HashSet<Character>();
        set.add(s.charAt(0));
        
        while(right < s.length()){
        	if(set.contains(s.charAt(right))){
    			max = Math.max(max, right - left);
        		while(left < right){
        			if(s.charAt(left) == s.charAt(right)){
        				left++;
        				break;
        			}else{
        				set.remove(s.charAt(left));
        				left++;
        			}
        		}
        	}
        	else{
        		set.add(s.charAt(right));
        	}
        	
        	right++;
        }
        
		max = Math.max(max, s.length() - left);
		return max;
    }
}
