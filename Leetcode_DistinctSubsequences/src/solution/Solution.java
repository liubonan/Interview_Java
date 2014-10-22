package solution;

public class Solution {
	public int numDistinct(String S, String T) {
        if(S == null || S.length() == 0 || T == null || T.length() == 0){
        	return 0;
        }
        
        int[][] count = new int [S.length() + 1][T.length() + 1];
        count[0][0] = 1;
        for(int i = 1; i <= S.length(); i++){
        	count[i][0] = 0;
        }
        
        for(int i = 1; i <= T.length(); i++){
        	count[0][i] = 0;
        }
        
        for(int i = 1; i <= S.length(); i++){
        	for(int j = 1; j <= T.length(); j++){
        		count[i][j] = count[i - 1][j];
        		if(S.charAt(i - 1) == T.charAt(j - 1)){
    				count[i][j] += count[i - 1][j - 1];
    			}
        	}
        }
        
        return count[S.length()][T.length()];
    }
}
