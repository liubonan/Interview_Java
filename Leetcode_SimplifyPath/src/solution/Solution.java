package solution;

import java.util.Arrays;
import java.util.*;

public class Solution {
	public String simplifyPath(String path) {
        if(path == null){
        	return null;
        }
        
        Stack<String> stack = new Stack<String>();
        
        StringBuilder sb = new StringBuilder();
        for(char c : path.toCharArray()){
        	if(c == '/'){
        		if(sb.length() > 0){
        			if(sb.toString().equals("..")){
        				if(stack.isEmpty()){
        					stack.push("..");
        				}
        				stack.pop();
        			}
        			else if(!sb.toString().equals(".")){
        				if(!stack.isEmpty() && stack.peek().equals("..")){
        					stack.pop();
        				}
        				else{
            				stack.push(sb.toString());
        				}
        			}
        			sb = new StringBuilder();
        		}
        	}
        	else{
        		sb.append(c);
        	}
        }
        
        if(sb.length() > 0){
			if(sb.toString().equals("..")){
				if(stack.isEmpty()){
					return "/";
				}
				stack.pop();
			}
			else if(!sb.toString().equals(".")){
				stack.push(sb.toString());
			}
			
			sb = new StringBuilder();
		}
        
        if(stack.isEmpty()){
        	return "/";
        }
        else{
        	while(!stack.isEmpty()){
        		sb.insert(0, stack.pop());
        		sb.insert(0, "/");
        	}
        }
        
        return sb.toString();
    }
}
