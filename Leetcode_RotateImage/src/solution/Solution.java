package solution;

import java.util.*;

public class Solution {
	public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return;
        }
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i < row / 2; i++){
        	for(int j = 0; j < (col + 1) / 2; j++){
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[row - 1 - j][i];
        		matrix[row - 1 - j][i] = matrix[row - 1 - i][col - 1 - j];
        		matrix[row - 1 - i][col - 1 - j] = matrix[j][col - 1 - i];
        		matrix[j][col - 1 - i] = tmp;
        	}
        }
    }
}
