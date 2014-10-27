package solution;

import java.util.Arrays;

public class Solution {
	public boolean isMatch(String s, String p) {

		if(s == null || p == null){
        	return false;
        }
		
		int plenNoStar = 0;
        for (char c : p.toCharArray())
            if (c != '*') plenNoStar++;
        if (plenNoStar > s.length()) return false;
        
        boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
        
        match[0][0] = true;
        
        for(int i = 1; i <= s.length(); i++){
        	match[i][0] = false;
        }
        
        for(int i = 1; i <= p.length(); i++){
        	match[0][i] = match[0][i - 1] && p.charAt(i - 1) == '*';
        }
        
        int[] firstTrue = new int[p.length() + 1];
        
        for(int i = 0; i <= p.length(); i++){
        	firstTrue[i] = match[0][i] ? 0 : Integer.MAX_VALUE;
        }
        
        
        for(int i = 1; i <= s.length(); i++){
        	
        	for(int j = 1; j <= p.length(); j++){
        		
				switch (p.charAt(j - 1)) {
				case '?':
					match[i][j] = match[i - 1][j - 1];
					break;
				case '*':
					if(firstTrue[j - 1] <= i - 1)
						match[i][j] = true;
					break;
				default:
					match[i][j] = match[i - 1][j - 1]
							&& s.charAt(i - 1) == p.charAt(j - 1);
				}
				
				if(match[i][j] && firstTrue[j] == Integer.MAX_VALUE){
					firstTrue[j] = i - 1;
				}
        	}
        }
        
        return match[s.length()][p.length()];
    }
}
