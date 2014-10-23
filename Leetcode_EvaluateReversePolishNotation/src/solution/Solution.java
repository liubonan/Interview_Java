package solution;

import java.util.*;

public class Solution {
	public int evalRPN(String[] tokens) {
        if(tokens == null){
        	return 0;
        }
        
        Stack<Integer> nums = new Stack<Integer>();
        
        for(int i = 0; i < tokens.length; i++){
        	if(tokens[i].equals("+") ||
        			tokens[i].equals("-") ||
        			tokens[i].equals("*") ||
        			tokens[i].equals("/")){
        		nums.push(this.calculate(nums.pop(), nums.pop(), tokens[i]));
        	}
        	else{
        		nums.push(Integer.valueOf(tokens[i]));
        	}
        }
        
        return nums.pop();
    }
	
	private Integer calculate(Integer num2, Integer num1, String op){
		if(op.equals("+")){
			return num1 + num2;
		}
		else if(op.equals("-")){
			return num1 - num2;
		}
		else if(op.equals("*")){
			return num1 * num2;
		}
		else{
			return num1 / num2;
		}
	}
}
