package solution;

public class Solution {
	public boolean isScramble(String s1, String s2) {
        
		if(s1 == null || s2 == null){
			return true;
		}
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		int n = s1.length();
		boolean dp[][][] = new boolean[n][n][n + 1];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				dp[i][j][0] = true;
				dp[i][j][1] = s1.charAt(i) == s2.charAt(j);
			}
		}
		
		for(int k = 2; k <= n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dp[i][j][k] = false;
					
					for(int len = 1; len < k && 
							i + len < n && 
							j + len < n && 
							j + k - len < n; len++){
						if((dp[i][j + k - len][len] && dp[i + len][j][k - len]) ||
								(dp[i][j][len] && dp[i + len][j + len][k - len])){
							dp[i][j][k] = true;
							break;
						}
					}
				}
			}
		}
		
		return dp[0][0][n];
    }
}
