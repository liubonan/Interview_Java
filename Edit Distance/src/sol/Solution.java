package sol;

public class Solution {

	/**
	 * Given two words word1 and word2, find the minimum number of steps
	 * required to convert word1 to word2. (each operation is counted as 1
	 * step.)
	 * 
	 * You have the following 3 operations permitted on a word:
	 * 
	 * a) Insert a character b) Delete a character c) Replace a character
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().minDistance("a", "b"));
	}
	
	public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(word1 == null || word1.length() == 0){
			return word2.length();
		}
		if(word2 == null || word2.length() == 0){
			return word1.length();
		}
		int[][] distance = new int[word1.length()+1][word2.length()+1];
		distance[0][0] = 0;
		for (int i = 1; i < word1.length()+1; i++) {
			distance[i][0] = i;
		}
		for (int i = 1; i < word2.length()+1; i++) {
			distance[0][i] = i;
		}
		
		for(int i = 1; i < word1.length()+1; i++){
			for(int j = 1; j < word2.length()+1; j++){
				if(word1.charAt(i-1) == word2.charAt(j-1)){
					distance[i][j] = distance[i-1][j-1];
				}
				else{
					distance[i][j] = 1 + Math.min(distance[i-1][j-1],Math.min(distance[i][j-1],distance[i-1][j]));
				}
			}
		}
		
		return distance[word1.length()][word2.length()];
    }

}
