package solution;

import java.util.HashSet;

public class Solution {
	public int longestConsecutive(int[] num) {
        if(num == null || num.length == 0){
        	return 0;
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i : num){
        	if(!set.contains(i)){
        		set.add(i);
        	}
        }
        
        int maxLength = 0;
        for(int i : num){
        	if(!set.contains(i)){
        		continue;
        	}
        	
        	int currLength = 1;
        	int curr = i + 1;
        	while(set.contains(curr)){
        		set.remove(curr);
        		curr++;
        		currLength++;
        	}
        	
        	curr = i - 1;
        	while(set.contains(curr)){
        		set.remove(curr);
        		curr--;
        		currLength++;
        	}
        	
        	maxLength= Math.max(currLength, maxLength);
        }
        
        return maxLength;
    }
}
