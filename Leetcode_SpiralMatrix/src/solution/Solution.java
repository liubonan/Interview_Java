package solution;

import java.util.*;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return new LinkedList<Integer>();
        }
        
        int row = 0, col = 0;
        List<Integer> result = new LinkedList<Integer>();
        
        while(row < (double)(matrix.length) / 2 &&
        		col < (double)(matrix[0].length) / 2){
        	
        	for(int i = col; i < matrix[0].length - col; i++){
        		result.add(matrix[row][i]);
        	}
        	
        	for(int i = row + 1; i < matrix.length - row - 1; i++){
        		result.add(matrix[i][matrix[0].length - col - 1]);
        	}
        	
        	if(matrix.length - row - 1 != row){
            	for(int i = matrix[0].length - col - 1; i >= col; i--){
            		result.add(matrix[matrix.length - row - 1][i]);
            	}
        	}
        	
        	if(matrix[0].length - col - 1 != col){
            	for(int i = matrix.length - row - 2; i > row; i--){
            		result.add(matrix[i][col]);
            	}
        	}
        	
        	row++;
        	col++;
        }
        
        return result;
    }
}
