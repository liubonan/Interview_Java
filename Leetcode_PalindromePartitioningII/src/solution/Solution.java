package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int minCut(String s) {
	    if(s == null || s.length() == 0){
	    	return 0;
	    }
	    boolean[][] isValid = this.getValidationArray(s);
	    
	    int[] cuts = new int[s.length()];
	    cuts[0] = 0;
	    
	    for(int i = 1; i < s.length(); i++){
	    	cuts[i] = Integer.MAX_VALUE;
	    	for(int j = 0; j <= i; j++){
	    		if(isValid[j][i + 1]){
	    			if(j == 0){
		    			cuts[i] = 0;
	    			}
	    			else{
		    			cuts[i] = Math.min(cuts[i], cuts[j - 1] + 1);
	    			}
	    		}
	    	}
	    }
	    
	    return cuts[s.length() - 1];
    }
	
	
	
	private boolean[][] getValidationArray(String s){
		boolean[][] isValid = new boolean[s.length() + 1][s.length() + 1];
		
		for(int i = 0; i < s.length(); i++){
			isValid[i][i + 1] = true;
		}
		
		for(int i = 0; i < s.length() - 1; i++){
			isValid[i][i + 2] = s.charAt(i) == s.charAt(i + 1);
		}
		
		for(int i = 0; i < s.length() + 1; i++){
			for(int j = 0; j <= i; j++){
				isValid[i][j] = false;
			}
		}
		
		for(int j = 3; j < s.length() + 1; j++){
			for(int i = 0; i + 2 < j; i++){
				isValid[i][j] = isValid[i + 1][j - 1] &&
						s.charAt(i) == s.charAt(j - 1);
			}
		}
		
		return isValid;
	}
}
