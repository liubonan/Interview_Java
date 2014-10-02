package solution;

public class Solution {
	public int minDistance(String word1, String word2) {
        if(word1 == null || word1.length() == 0){
        	return word2.length();
        }
        
        if(word2 == null || word2.length() == 0){
        	return word1.length();
        }
        
        int l1 = word1.length(), l2 = word2.length();
        int[][] distance = new int[l1 + 1][l2 + 1];
        
        for(int i = 0; i < l1 + 1; i++){
        	distance[i][0] = i;
        }
        
        for(int j = 1; j < l2 + 1; j++){
        	distance[0][j] = j;
        }
        
        for(int i = 1; i < l1 + 1; i++){
        	for(int j = 1; j < l2 + 1; j++){
        		distance[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1)
        				? distance[i - 1][j - 1]
        				: Math.min(distance[i][j - 1], 
        						Math.min(distance[i - 1][j], distance[i - 1][j - 1])) + 1;
        	}
        }
        
        return distance[l1][l2];
    }
}
