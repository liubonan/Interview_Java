package solution;

import java.util.*;

public class Solution {
	public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
        	return 0;
        }
        
        int[] height = new int[matrix[0].length + 1];
        for(int i = 0; i < matrix[0].length; i++){
        	height[i] = 0;
        }
        height[matrix[0].length] = -1;
        
        int max = 0;
        
        for(int i = 0; i < matrix.length; i++){
        	Stack<Integer> stack = new Stack<Integer>();
        	
        	for(int j = 0; j <= matrix[i].length; j++){
        		if(j != matrix[i].length){
                	height[j] = matrix[i][j] == '0' ? 0 : height[j] + 1;
        		}
            	
            	while(!stack.isEmpty() && height[j] < height[stack.peek()]){
            		int index = stack.pop();
            		int leftBound = stack.isEmpty() ? -1 : stack.peek();
            		max = Math.max(max, height[index] * (j - 1 - leftBound));
            	}
            	
            	stack.push(j);
            }
        }
        
        return max;
    }
}
