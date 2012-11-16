package sol;

import java.util.ArrayList;

public class Solution {

	/**
	 * Given a matrix of m x n elements (m rows, n columns), return all elements
	 * of the matrix in spiral order.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.print(new Solution().spiralOrder(A));
	}
	
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(matrix.length == 0)
        	return new ArrayList<Integer>();
        if(matrix[0].length == 0)
        	return new ArrayList<Integer>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        ArrayList<Integer> result= new ArrayList<Integer>();
        
        int iterations = Math.min(m, n);
        
        for(int r = 0; r < iterations/2;r++){
        	
        	for(int i = r; i < n-r;i++){
        		result.add(matrix[r][i]);
        	}
        	for(int i = r+1; i < m - r; i++){
        		result.add(matrix[i][n-r-1]);
        	}
        	for(int i = n-r-2; i >=r;i--){
        		result.add(matrix[m-r-1][i]);
        	}
        	for(int i = m - r - 2; i >= r+1; i--){
        		result.add(matrix[i][r]);
        	}
        }
        
        if(m >= n){
        	if(n % 2 == 1){
        		int r = n/2;
        		for(int j = r+1; j < m - r + 1;j++)
        			result.add(matrix[j][r+1]);
        	}        	
        }
        else{
        	if(m % 2 == 1){
        		int r = m/2;
        		for(int j = r+1; j < n - r + 1;j++)
        			result.add(matrix[r+1][j]);
        	}
        }
        
        return result;
    }

}
