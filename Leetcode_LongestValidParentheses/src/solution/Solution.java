package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Solution {
	public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0){
        	return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int length = 0;
        
        for(int i = 0; i < s.length(); i++){
        	if(stack.isEmpty()){
        		if(s.charAt(i) == '('){
        			stack.push(i);
        		}
        		else{
        			length = 0;
        		}
        	}
        	else{
        		if(s.charAt(i) == '('){
        			stack.push(i);
        		}
        		else{
        			int curr = stack.pop();
        			if(stack.isEmpty()){
        				length += (i - curr + 1);
        				max = Math.max(max, length);
        			}
        		}
        	}
        }
        
        int right = s.length();
        while(!stack.isEmpty()){
        	length = right - stack.peek() - 1;
        	max = Math.max(max, length);
        	right = stack.pop();
        }
        
        return max;
    }
}
