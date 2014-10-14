package solution;

public class Solution {
	public int atoi(String str) {
        int result = 0;
        boolean valid = false;
        int positive = 1;
        for(int i = 0; i < str.length(); i++){
        	if(Character.isWhitespace(str.charAt(i))){
        		if(valid){
            		return result * positive;
        		}
        	}
        	else if(str.charAt(i) == '-'){
        		if(valid){
        			return result * positive;
        		}
        		else{
        			positive = -1;
        			valid = true;
        		}
        	}
        	else if(str.charAt(i) == '+'){
        		if(valid){
        			return result * positive;
        		}
        		else{
        			valid = true;
        		}
        	}
        	else if(Character.isDigit(str.charAt(i))){
        		if(result == (int)Integer.MAX_VALUE / 10){
        			if(positive == 1 && (str.charAt(i) - '0') > 7){
        				return Integer.MAX_VALUE;
        			}
        			else if(positive == -1 && (str.charAt(i) - '0') > 8){
        				return Integer.MIN_VALUE;
        			}
        		}
        		else if(result > (int)Integer.MAX_VALUE / 10){
        			return positive == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        		}
        		
        		result = result * 10 + (str.charAt(i) - '0');
            	valid = true;
        	}
        	else{
        		return result * positive;
        	}
        }
        
        return result * positive;
    }
}
