package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {

	public boolean wordBreak(String s, Set<String> dict) {
        if(s == null || dict == null || dict.size() == 0 || s.length() == 0){
        	return false;
        }
        
        boolean[] canSplit = new boolean[s.length()];
        canSplit[0] = dict.contains(s.substring(0, 1));
        
        for(int i = 1; i < canSplit.length; i++){
        	canSplit[i] = dict.contains(s.substring(0, i + 1));
        	
        	for(int j = 0; j < i; j++){
        		canSplit[i] |= canSplit[j] && dict.contains(s.substring(j + 1, i + 1));
        	}
        }
        
        return canSplit[canSplit.length - 1];
    }
}
