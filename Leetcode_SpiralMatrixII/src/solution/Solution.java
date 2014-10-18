package solution;

import java.util.*;

public class Solution {
	public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
		
		if(n == 0){
        	return result;
        }
		
		int next = 1;
		int row = 0, col = 0;
		
		while(row < (double)n / 2 &&
				col < (double)n / 2){
			
			for(int i = col; i < n - col; i++){
				result[row][i] = next++;
			}
			
			for(int i = row + 1; i < n - row - 1; i++){
				result[i][n - col - 1] = next++;
			}
			
			if(row != n - row - 1){
				for(int i = n - col - 1; i >= col; i--){
					result[n - row - 1][i] = next++;
				}
			}
			
			if(col != n - col -1){
				for(int i = n - row - 2; i > row; i--){
					result[i][col] = next++;
				}
			}
			
			row++;
			col++;
		}
		
		return result;
    }
}
