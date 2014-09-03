package solution;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : s.toCharArray()){
        	switch(c){
        	case '(': case '[': case '{':
        		stack.push(c);
        		break;
        	case ')':
        		if(!stack.isEmpty() && stack.peek() == '('){
        			stack.pop();
        		}
        		else{
        			return false;
        		}
        		break;
        	case ']':
        		if(!stack.isEmpty() && stack.peek() == '['){
        			stack.pop();
        		}
        		else{
        			return false;
        		}
        		break;
        	case '}':
        		if(!stack.isEmpty() && stack.peek() == '{'){
        			stack.pop();
        		}
        		else{
        			return false;
        		}
        		break;
        	default:
        		return false;
        	}
        }
		

    	if(stack.isEmpty()){
    		return true;
    	}
    	
    	return false;
    }
}
