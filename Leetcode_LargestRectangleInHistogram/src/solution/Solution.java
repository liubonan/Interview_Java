package solution;

import java.util.*;

public class Solution {
	public int largestRectangleArea(int[] height) {
		
		if(height == null || height.length == 0){
			return 0;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < height.length; i++){
			while(!stack.isEmpty() && height[i] < height[stack.peek()]){
				int h = height[stack.pop()];
				int w = stack.empty() ? i : i - stack.peek() - 1;
				max = Math.max(max, h * w);
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty()){
			int h = height[stack.pop()];
			int w = stack.empty() ? height.length : height.length - stack.peek() - 1;
			max = Math.max(max, h * w);
		}
        
		return max;
    }
}
