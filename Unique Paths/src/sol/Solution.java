package sol;

public class Solution {

	/**
	 * A robot is located at the top-left corner of a m x n grid.
	 * The robot can only move either down or right at any point 
	 * in time. The robot is trying to reach the bottom-right corner 
	 * of the grid (marked 'Finish' in the diagram below).
	 * 
	 * How many possible unique paths are there?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Solution().uniquePaths(10, 10));

	}
	
	public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [][] paths = new int [m][n];
        
        
        for(int i = 0;i < m; i++)
        	paths[i][0] = 1;
        
        for(int j = 0;j < n; j++)
        	paths[0][j] = 1;        
        
        for(int i = 1;i < m; i++){
        	for(int j = 1; j < n; j++){
        		paths[i][j] = paths[i-1][j]+paths[i][j-1];
        	}
        }
        
        return paths[m-1][n-1];
    }

}
