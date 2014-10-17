package solution;

public class Solution {
	public boolean isPalindrome(int x) {
        if(x < 0){
        	return false;
        }
        
        int left = 0, right = 0;
        int divisor = 1;
        
        while(x / divisor >= 10){
        	divisor *= 10;
        }
        
        while(x > 0){
        	right = x % 10;
        	left = x / divisor;
        	
        	if(left != right){
        		return false;
        	}
        	
        	x = (x % divisor) / 10;
        	divisor /= 100;
        }
        
        return true;
    }
}
