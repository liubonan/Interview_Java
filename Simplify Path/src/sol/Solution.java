package sol;

import java.util.Stack;

public class Solution {

	/**
	 * Given an absolute path for a file (Unix-style), simplify it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().simplifyPath("///"));
	}
	
	public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(path.isEmpty())
        	return "";
        
        String [] tokens = path.split("/");
        Stack<String> s = new Stack<String>();
        
        for(int i = 1; i < tokens.length; i++){
        	if(tokens[i].equals("."))
        		continue;
        	else if(tokens[i].equals("..") && !s.isEmpty()){
        		s.pop();
        	}
        	else if(tokens[i].equals("..") && s.isEmpty()){
        		continue;
        	}
        	else if(!tokens[i].isEmpty()){
        		s.push(tokens[i]);
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
        	sb.insert(0,s.pop());
        	sb.insert(0, "/");
        }
        
        if(sb.length() == 0)
        	sb.append("/");
        
        return sb.toString();
    }

}
